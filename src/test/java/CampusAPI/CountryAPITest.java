package CampusAPI;

import CampusAPI.CountryAPI.Country;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CountryAPITest {

    Cookies cookies;

    @BeforeClass

    @Test
    void Login() {
        baseURI = "https://test.mersys.io/school-service/api/countries";

        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", "turkeyts");
        credentials.put("password", "TechnoStudy123");
        credentials.put("rememberMe", "true");


        cookies = given()
                .body(credentials)
                .contentType(ContentType.JSON)
                .when()
                .post("https://test.mersys.io/auth/login")
                .then()
                //.log().body()
                .extract().response().getDetailedCookies();
    }

    public String randomCountryname() {
        return RandomStringUtils.randomAlphabetic(6);
    }

    public String randomCountrycode() {
        return RandomStringUtils.randomAlphabetic(3);
    }

    Country countryRequest;
    Country countryResponse;

    @Test()
    void createCountry() {

        countryRequest = new Country();
        countryRequest.setName(randomCountryname());
        countryRequest.setCode(randomCountrycode());
        countryRequest.setHasState(false);
        countryResponse = given()
                .body(countryRequest)
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .post("")
                .then()
                .statusCode(201)
                //.log().body();
                .extract().jsonPath().getObject("", Country.class);


    }

    @Test(dependsOnMethods = "createCountry")
    void createCountryNegativeTest() {
        given()
                .body(countryRequest)
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .post("")
                .then()
                .statusCode(400);
    }

    /**
     * Update the country we created
     **/

    @Test(dependsOnMethods = "createCountry", priority = 1)
    void updateCountry(){
        countryResponse.setName(randomCountryname());

        given()
                .body(countryResponse)
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .put("")
                .then()
                .statusCode(200)
                .body("name", equalTo(countryResponse.getName()));
    }

    /** Delete the country we created**/
    @Test(dependsOnMethods = "createCountry", priority = 2)
    void deleteCountry(){
        given()
                .pathParam("countryId",countryResponse.getId())
                .cookies(cookies)
                .when()
                .delete("/{countryId}")
                .then()
                .statusCode(200);
    }

    /** Delete country negative test**/
    @Test(dependsOnMethods = {"deleteCountry", "createCountry"})
    void deleteCountryNegativeTest(){
        given()
                .pathParam("countryId",countryResponse.getId())
                .cookies(cookies)
                .when()
                .delete("/{countryId}")
                .then()
                .statusCode(400);
    }
}
