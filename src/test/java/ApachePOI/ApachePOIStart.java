package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachePOIStart {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sheet1");
        Row row1 = sheet.getRow(0);
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);

        Cell cell2 = row1.getCell(1);
        System.out.println(cell2);

        Row row3= sheet.getRow(3);
        Cell cell3=row3.getCell(1);
        System.out.println(cell3);










    }
}
