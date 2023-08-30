package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstLastGetRowGetType extends DBUtilities {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last(); // jumps to the last row right away

        String cityName = rs.getString("city");
        System.out.println("cityName from the last row = " + cityName);

        // if a column contains only numbers we can get the value either as a String or as an int
        int cityId = rs.getInt("city_id");
        System.out.println("cityId as an int = " + cityId);

        String cityIdStr = rs.getString("city_id");
        System.out.println("cityId as a String = " + cityIdStr);

        rs.absolute(123);
        int currentRowNumber = rs.getRow(); // Gives the number of the current row, not id of the row
        System.out.println("currentRowNumber = " + currentRowNumber);

        rs.last();
        int numberOfTheLastRow = rs.getRow();
        System.out.println("numberOfRows = " + numberOfTheLastRow);

        rs.first(); // jumps to the first row
        cityName = rs.getString("city");
        System.out.println("cityName from the first row = " + cityName);
    }
}




















