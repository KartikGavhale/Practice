package com.ebanking.test_class;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebanking.pom_class.LoginPage;
import com.ebanking.utility_class.Utility;

public class TC_SSC3 extends BaseClass
{
	@Test(dataProvider="xldata")
	public void logintest(String u,String p) throws InterruptedException, IOException, HeadlessException, AWTException
	{
		System.out.println("starting test");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(u);
		lp.setPassword(p);
		lp.Submit();
		

		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			log.warn("Login failed");
		}
		else
		{
			

			Assert.assertTrue(true);
			log.info("Login passed");
			lp.out();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		}


	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}

	@DataProvider(name="xldata")
	String [][] getData() throws EncryptedDocumentException, IOException
	{
		String path = "./Resource//e_banking.xlsx";

		File f = new File(path);
		Sheet sh =WorkbookFactory.create(f).getSheet("Sheet1");
		int rows = sh.getLastRowNum(); //5
		int col = sh.getRow(0).getLastCellNum(); //2
		String[][] data = new String[rows][col];
		for(int i = 1  ; i<=rows ; i++)
		{
			for(int j = 0; j<col;j++)
			{
				data [i-1][j] = sh.getRow(i).getCell(j).getStringCellValue(); 
			}
		}
		return data;
	}

}
