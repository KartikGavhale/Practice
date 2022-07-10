package com.ebanking.test_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ebanking.pom_class.LoginPage;
import com.ebanking.utility_class.Utility;

public class TC_SS1 extends BaseClass
{
	
	@Test(enabled=false)
	public void LoginTest1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ExtentTest Test = extent.createTest("initiating Test 1 ");
		
		
		int Case =1;
		log.info("test case : "+ Case);
		driver.get(URL);
		Test.log(Status.PASS,"Url opened");
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		Test.pass("user id entered");
		log.info("user id entered ");
		lp.setPassword(Case);
		Test.pass("Password entered ");
		log.info("password entered");
		lp.Submit();
		Test.pass("submited");
		log.info("submit button clicked");
		
		
			log.info("True Condition verified now checking for title");
		Thread.sleep(2000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Title matched ");
		}else
		{
			Assert.assertTrue(false);
			log.info("title did'nt matched");
		}
		
	}
	@Test(enabled=false)
	public void LoginTest2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ExtentTest Test = extent.createTest("initiating Test 2 ");
		int Case =2;
		log.info("test case : "+ Case);
		driver.get(URL);
		Test.log(Status.PASS,"Url opened");
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		Test.pass("user id entered");
		log.info("user id entered ");
		Test.pass("Password entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		Test.pass("submited");
		
			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
	}
	@Test
	public void LoginTest3() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ExtentTest Test = extent.createTest("initiating Test 3 ");

		int Case =3;
		log.info("test case : "+ Case);
		driver.get(URL);
		
		log.info("url open");
		Test.log(Status.PASS,"Url opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		Test.pass("user id entered");
		log.info("user id entered ");
		Test.addScreenCaptureFromPath(Utility.SS(driver));
		Test.pass("Password entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		Test.pass("submited");


			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
	}
	
	@Test(enabled=false)
	public void LoginTest4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ExtentTest Test = extent.createTest("initiating Test 4 ");

		int Case =4;
		log.info("test case : "+ Case);
		driver.get(URL);
		Test.log(Status.PASS,"Url opened");
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		Test.pass("user id entered");
		log.info("user id entered ");
		Test.pass("Password entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		Test.pass("submited");

		
			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
	}
	

}
