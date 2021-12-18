package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void writedata() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\Desktop\\Book3write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("First_name");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Email_ID");
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("MAX");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("max122@gmail.com");
		wb.getSheet("Data").createRow(2).createCell(0).setCellValue("JOHN");
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("john456@gmail.com");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("WRITE SUCCESSFULLY DONE");

	}
public static void main(String[] args) throws Throwable {
	writedata();
}
}

