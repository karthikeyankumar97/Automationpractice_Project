package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Read_Data {
	public static void particular_Data() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mini_Project1\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		System.out.println("**************PARTICULAR_DATA***************");
		if (cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double cellvalue = cell.getNumericCellValue();
			int value = (int) cellvalue;
			System.out.println(value);
			
		}
		
		
	}
	public static void all_Data() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mini_Project1\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("*************ALL_DATA**************");
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String CellValue = cell.getStringCellValue();
					System.out.println(CellValue);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double CellValue = cell.getNumericCellValue();
					int value = (int) CellValue;
					System.out.println(value);
					
					
				}
				
				
				
			}
		
			
		}

	}
	public static void particular_Row() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mini_Project1\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		System.out.println("*************ROW_DATA***********");
		Row row = sheetAt.getRow(3);
		for (int i = 0; i <1 ; i++) {
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String CellValue = cell.getStringCellValue();
					System.out.println(CellValue);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double CellValue = cell.getNumericCellValue();
					int value = (int) CellValue;
					System.out.println(value);
					
				}
				
			}
			
		}

	}
	public static void particular_Celldata() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mini_Project1\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		System.out.println("***********PARTICULAR_CELLDATA**********");
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i <numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j <1; j++) {
				Cell cell = row.getCell(2);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String CellValue = cell.getStringCellValue();
					System.out.println(CellValue);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double CellValue = cell.getNumericCellValue();
					int value=(int) CellValue;
					System.out.println(value);
					
				}
				
			}
			
		}
		
		

	}
	public static void main(String[] args) throws Throwable {
		particular_Data();
		all_Data();
		particular_Row();
		particular_Celldata();
		
	}

}
