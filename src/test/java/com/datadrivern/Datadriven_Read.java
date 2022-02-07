package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {
	
	public static void read_Particular_Data() throws Throwable {

		File f = new File("D:\\eclipse\\maven_project\\Excel\\user Id.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double value =cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}
		
		
		
	}
	
	public static void read_All_Data() throws Throwable {

		File f = new File("D:\\\\eclipse\\\\maven_project\\\\Excel\\\\user Id.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook  w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double value =cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
				}
		
			}
		}
				
}
	public static  void read_Row_Data() throws Throwable {

		File f = new File("D:\\\\eclipse\\\\maven_project\\\\Excel\\\\user Id.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double value =cell.getNumericCellValue();
				int num = (int) value;
				System.out.println(num);
			}
	
		}
		}
	
	public static  void read_Column_data() throws Throwable {

		File f = new File("D:\\\\eclipse\\\\maven_project\\\\Excel\\\\user Id.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 1  ; j < numberOfCells ; j++) {
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			
if (cellType.equals(CellType.STRING)) {
				
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double value =cell.getNumericCellValue();
				int num = (int) value;
				System.out.println(num);
			}
			}
		}
		
	}
		
	
	public static void main(String[] args) throws Throwable {
//		read_Particular_Data();
//	    read_All_Data();
//	read_Row_Data();
	read_Column_data();
	}
	

}
