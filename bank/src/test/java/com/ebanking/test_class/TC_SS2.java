package com.ebanking.test_class;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebanking.pom_class.LoginPage;

public class TC_SS2  extends BaseClass
{
	@Test(dataProvider="xldata")
	public void logintest(String u,String p) throws InterruptedException
	{
		System.out.println("starting test");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(u);
		
		lp.setPassword(p);
		
		lp.Submit();
		
		try {
			driver.switchTo().alert();
			Alert a = driver.switchTo().alert();
			String actual= a.getText();
			String expected = "User or Password is not valid";
			
			if(actual.equals(expected))
			{
				System.out.println("Invalid Credential popup test Passed");
				a.accept();
				
			}else {
				System.out.println("Invalid Credential popup test Failed");
			}
		}catch(NoAlertPresentException e)
		{
			System.out.println("Login Credentials Passed");
			lp.out();
			driver.switchTo().alert().accept();
			
		}
		
	}
	
	@DataProvider(name="xldata")
	String [][] getData() throws EncryptedDocumentException, IOException
	{
		String path = "./Resource//e_banking.xlsx";
		
		File f = new File(path);
		 Sheet sh =WorkbookFactory.create(f).getSheet("Sheet1");
		 int rows = sh.getLastRowNum();
		 int col = sh.getRow(0).getLastCellNum();
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
