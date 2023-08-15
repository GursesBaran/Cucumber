package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class GetAllDataFromExcel {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

//        int numberOfRows = sheet.getPhysicalNumberOfRows(); // zoo.length
//
//        for (int i = 0; i < numberOfRows; i++) {
//            Row row = sheet.getRow(i);
//            int numberOfCells = row.getPhysicalNumberOfCells(); // zoo[i].length
//            for (int j = 0; j < numberOfCells; j++) {
//                Cell cell = row.getCell(j);
//                System.out.print(cell+", ");
//            }
//            System.out.println();
//            System.out.println("----------------------");
//
//        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
//                Cell cell = sheet.getRow(i).getCell(j);
                System.out.print(sheet.getRow(i).getCell(j)+", ");
            }
            System.out.println();
            System.out.println("----------------------");
        }
    }
}

