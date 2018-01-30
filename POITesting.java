package com.org.learningMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class POITesting {


	//make these values as a global variable
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	
	public POITesting(String excelPath) {
		
		try {
			
			//path of the excel: "P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx"
			File src=new File(excelPath);
			
			FileInputStream fis= new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
			
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("The file is not found.");
		}catch(IOException e1) {
			System.out.println("There is a IO Exception");
		}catch(Exception e2) {
			System.out.println("There is an Exception error");
		}
		
		
	}
	
	//takes all the values 
	public String getData(int sheetNumber, int rowNumber, int ColumnNumber) {
		
		sheet1=wb.getSheetAt(sheetNumber);
		
		String data= sheet1.getRow(rowNumber).getCell(ColumnNumber).getStringCellValue();
		
		return data;
	}

	}


