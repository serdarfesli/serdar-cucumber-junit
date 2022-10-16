package com.cydeo.apachiTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
@Test
    public void readFromExcelFile() throws IOException {
    String path = "sampleData.xlsx";
    FileInputStream fileInputStream = new FileInputStream(path);
// workbook>sheet>row>cell
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    XSSFSheet sheet = workbook.getSheet("Employees");
    System.out.println(sheet.getRow(1).getCell(0));

    System.out.println(sheet.getRow(1).getCell(2));
}

}
