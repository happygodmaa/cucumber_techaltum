package org.techAltum.dataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {	
	//approach 1- use of private static variable(initial null and create when required), 
	//private constructor and factory method(getExcelReader)
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	Row row1, myRow;
	Cell cell1, myCell;
	private static ExcelReader er=null;
	private ExcelReader() {		
	}	
	public static ExcelReader getExcelReader() {
		if(er==null) {
			er=new ExcelReader();
		}
		return er;}
	
public void readExcel() {
	
	String projectPath= System.getProperty("user.dir");
	try {
	fis= new FileInputStream(projectPath+"\\data\\Book1.xlsx");
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();		
	}
	
	try {
		wb= new XSSFWorkbook(fis);
	} catch (IOException e) {		
		e.printStackTrace();
	}	
	sheet1= wb.getSheetAt(0);
		
	int firstRowNumber= sheet1.getFirstRowNum();
	int lastRowNumber= sheet1.getLastRowNum();
	
	row1= sheet1.getRow(firstRowNumber);
	
	int firstCellNumber= row1.getFirstCellNum();
	int lastCellNumber= row1.getLastCellNum();
	
	int rowNumber=lastRowNumber-firstRowNumber;
	int cellNumber=lastCellNumber-firstCellNumber;
	
	String[][] s= new String[rowNumber][cellNumber];
	
	for(int i=firstRowNumber+1, m=0;i<=lastRowNumber; i++, m++) {
		for(int j= firstCellNumber, n=0; j<lastCellNumber; j++, n++) {
			
			myRow= sheet1.getRow(i);
			myCell= myRow.getCell(j);
			
			s[m][n]= myCell.getStringCellValue();
			
			
		}
	}
	
	
	
	
}
}
/*
 *approach 2- use of private static variable(creation of object initially), private constructor and factory method(getExcelReader)
 * 
 * private static er= new ExcelReader(); 
 * private ExcelReader(){
 * } 
 * public ExcelReader getExcelReader(){
 * return er; 
 * }
 * }
 */

