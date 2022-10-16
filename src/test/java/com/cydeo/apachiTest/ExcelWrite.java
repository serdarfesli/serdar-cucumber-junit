package com.cydeo.apachiTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {

        String path = "sampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        XSSFCell salaryHEader = sheet.getRow(0).createCell(3);
        salaryHEader.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(2000);
        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(3000);

        int lastUsedRow = sheet.getLastRowNum();
        for (int rowNum = 0; rowNum < lastUsedRow; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")) {
                sheet.getRow(rowNum).getCell(1).setCellValue("Jones");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        workbook.write(fileOutputStream);

        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
