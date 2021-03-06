package com.ebanking.test_class;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebanking.pom_class.LoginPage;
import com.ebanking.utility_class.ReadConfig;

public class TC_SS2  extends BaseClass
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
		

		try {
			
			
			driver.switchTo().alert();
			Alert a = driver.switchTo().alert();
			String actual= a.getText();
			String expected = "User or Password is not valid";


			if(actual.equals(expected))
			{
				a.accept();
			}else {
				System.out.println("popup test Failed");

			}
		}catch(NoAlertPresentException e)
		{
			String Expected = "Guru99 Bank Manager HomePage";
			if(driver.getTitle().equals(Expected))
			{
				
				String id ="Manger Id : "+ ReadConfig.getuser();

				String manager =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
				System.out.println(id +"----"+manager);
				if(id.equals(manager))
				{

					System.out.println("Login page info correct");
				}else 
				{					System.out.println("Login page infor wrong");

				}
			}
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
