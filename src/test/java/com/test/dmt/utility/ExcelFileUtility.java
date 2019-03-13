package com.test.dmt.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileUtility
  { 
	 
	 public void writeIntoCell(int rownumber, int cellnumber,String data) throws IOException
		{
			File file =  new File(Constants.FILEPATH+"\\"+Constants.FILE_NAME); 
	        FileInputStream inputStream = new FileInputStream(file); 
	        
	        
	       
	        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	        XSSFSheet sheet = workbook.getSheet(Constants.SHEET_NAME); 
	        
	        Row row = sheet.getRow(rownumber);    
	        Cell cell = row.getCell(cellnumber, MissingCellPolicy.CREATE_NULL_AS_BLANK);
	        cell.setCellValue(data);

	        FileOutputStream outputStream = new FileOutputStream(file,false);
	        workbook.write(outputStream);
	        outputStream.flush();
	        outputStream.close();
	        workbook.close();		
			
		}
		
		
		public String readFromCell(int rownumber, int cellnumber) throws IOException
		  {
			
			 File file =  new File(Constants.FILEPATH+"\\"+Constants.FILE_NAME); 
	         FileInputStream inputStream = new FileInputStream(file); 
	        
	         XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	         XSSFSheet sheet = workbook.getSheet(Constants.SHEET_NAME); 
	        
	         Row row = sheet.getRow(rownumber);    
	         Cell cell = row.getCell(cellnumber,MissingCellPolicy.RETURN_BLANK_AS_NULL);
	       
	         Double  dvalue = cell.getNumericCellValue();
	         Integer value = dvalue.intValue() ;
	         String  celldata = value.toString();
	        
	        
	         workbook.close();
	        
	        return celldata;
		}

	

  }
