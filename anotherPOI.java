package com.org.learningMaven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class anotherPOI {
	
	public static void main(String[] args) {
		
		try {
		
		//specify the location where the excel sheet is located.
		
		File src=new File("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
		
		//loaded the excel sheet in the form of bytes
		FileInputStream fis= new FileInputStream(src);
		
		//the total excel sheet  will be known as a total workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//if you have multiple sheets in a excel file, you need to specify which sheet you will be working with.
		
		//wb.getSheetAt(index);
		//0-- sheet 1 
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//specify which row and which column you will be using 
		//row and column also focuses on the 0 index so  if you type in 0 it refers to row1 or column1
		
		//using the sheet1 object call the getRow which states which row you will be using and getCell states which column you will be choosing
		
		String data0=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data0);
		
		//returns the number of rows in your excel sheet
		int rowCount= sheet1.getLastRowNum();
		
		//System.out.println("Total row is" + rowCount);
		
		wb.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
