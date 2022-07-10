package com.ebanking.utility_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	
	
	
	public static String readXL(int i , int j) throws EncryptedDocumentException, IOException
	{
		String Path = "./Resource//e_banking.xlsx";
		FileInputStream f = new FileInputStream(Path);
		
	Workbook wb = WorkbookFactory.create(f);
	Sheet sh = wb.getSheet("Sheet1");
	Row r= sh.getRow(0);
	sh.getLastRowNum();
	r.getLastCellNum();
	Cell cell = sh.getRow(i).getCell(j);
	CellType type = cell.getCellType();
	String type1 = type.toString();
	if(type1=="STRING")
	{
		String value =cell.getStringCellValue();
		return value ;
	}else
		{if(type1=="NUMERIC")
		 {
			double val = cell.getNumericCellValue();
			long valu = (long)val;
			String value = String.valueOf(valu);
			return value;
		 }else 
			{
			boolean val = cell.getBooleanCellValue();
			String value = String.valueOf(val);
			return value;
			}
		}
	}
	
	
	public static String SS(WebDriver driver) throws IOException
	{
		Date d = new Date();
		File org 	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "./Screenshot//"+d.toString().replaceAll(":", "_")+"E-bank.pnj";
		File f = new File(path);
		FileHandler.copy(org, f);
		return path ;
	}
	
	

}
