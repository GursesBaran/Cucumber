package ApachePOI;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GetASpecificData {
    /**
     * Write the code that gives specific data the user wants
     * E.g. When user types username print the username from the Excel file
     */

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/LoginData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Login");

    }
}