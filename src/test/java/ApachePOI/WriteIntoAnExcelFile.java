package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteIntoAnExcelFile {
    public static void main(String[] args) throws IOException {
        String  path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        Row row0 = sheet.createRow(0);

    }
}
