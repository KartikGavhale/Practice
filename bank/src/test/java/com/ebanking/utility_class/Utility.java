package com.ebanking.utility_class;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	@SuppressWarnings("unused")
	public static String readXL(int i , int j) throws EncryptedDocumentException, IOException
	{
		String Path = "./Resource//e_banking.xlsx";
		FileInputStream f = new FileInputStream(Path);
		
	Workbook wb = WorkbookFactory.create(f);
	Sheet sh = wb.getSheet("Sheet1");
	Row r= sh.getRow(0);
	int rows = sh.getLastRowNum();
	int cols = r.getLastCellNum();
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
	
	public String[][] XLdata() throws EncryptedDocumentException, IOException
	{
		String path  = "./Resource/e_banking.xlsx";
		FileInputStream f = new FileInputStream(path);
		Sheet sh =WorkbookFactory.create(f).getSheet("Sheet1");
		int rows= sh.getLastRowNum();
		int cols = sh.getRow(0).getLastCellNum();
		
		String data[][]=new String[rows][cols];
		
		for(int i=1;i<=rows;i++)
		{
			for(int j = 0 ; j<cols;j++)
			{
				data[i-1][j]=readXL(i,j);
			}
		}
		return data;
	}
	
	
	public static void SS(WebDriver driver) throws IOException
	{
		Date d = new Date();
		File org 	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "./Screenshot//"+d.toString().replaceAll(":", "_")+"E-bank.pnj";
		File f = new File(path);
		FileHandler.copy(org, f);
		
	}
	
	public static String AlertSS(WebDriver driver) throws HeadlessException, AWTException, IOException
	{
		Date d = new Date();
		
		BufferedImage bi = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		String path = "./Screenshot//"+d.toString().replaceAll(":", "_")+"E-bank.jpg";
		
		ImageIO.write(bi, "jpg",new File(path));
		return path;
	}
	public static String ScreenShot(WebDriver driver) throws IOException, HeadlessException, AWTException
	{
		try
		{

			Date d = new Date();

			File org 	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String path = "./Screenshot//"+d.toString().replaceAll(":", "_")+"E-bank.jpg";
			File f = new File(path);
			FileHandler.copy(org, f);
			return path ;
			
		}catch(UnhandledAlertException e)
		{
			Date d = new Date();

			BufferedImage bi = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String path = "./Screenshot//"+d.toString().replaceAll(":", "_")+"E-bank.jpg";
			
			ImageIO.write(bi, "jpg",new File(path));
			return path;
		}
		
	}
	
	

}
