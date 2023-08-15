package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class GetAllDataInARow {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(1); // zoo[1]

        for (int i = 0; i < 4; i++) {
            System.out.println(row.getCell(i));
        }
    }
}


