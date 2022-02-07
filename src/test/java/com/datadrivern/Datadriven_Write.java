package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void writeData() throws Throwable {

		File f = new File("D:\\eclipse\\maven_project\\Excel\\user Id.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
	    Sheet createSheet = w.createSheet("user info");
	    Row createRow = createSheet.createRow(0);
	    Cell createCell = createRow.createCell(0);
	    createCell.setCellValue("vicky");
	    w.getSheet("user info").getRow(0).createCell(1).setCellValue("123");
	    w.getSheet("user info").createRow(1).createCell(0).setCellValue("lava");
	    w.getSheet("user info").getRow(1).createCell(1).setCellValue("456");
	    w.getSheet("user info").createRow(2).createCell(0).setCellValue("arut");
	    w.getSheet("user info").getRow(2).createCell(1).setCellValue("789");
	    
	    FileOutputStream fos = new FileOutputStream(f);
	    w.write(fos);
	    w.close();
		
	}
	
	
	public static void main(String[] args) throws Throwable {
		writeData();
	}
}
