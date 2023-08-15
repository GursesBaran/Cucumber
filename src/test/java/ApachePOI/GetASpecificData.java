package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GetASpecificData {
    /**
     * Write the code that gives specific data the user wants
     * E.g. When user types username print the username from the Excel file
     * */

    public static void main(String[] args) throws IOException {
        System.out.println("What do you want to search?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();

        String path = "src/test/java/ApachePOI/Resources/LoginData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Login");
        // TODO: Complete the task

    }
}

