package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel {
    public static ArrayList<ArrayList<String>> getDataFromExcel(String path, String sheetName, int columnCount){
        FileInputStream fileInputStream = null;
        Workbook workbook = null;
        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet(sheetName);
        ArrayList<ArrayList<String>> returnList = new ArrayList<>();
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                Cell cell = sheet.getRow(i).getCell(j);
                innerList.add(cell.toString());

            }
            returnList.add(innerList);
        }
        return returnList;
    }
}
