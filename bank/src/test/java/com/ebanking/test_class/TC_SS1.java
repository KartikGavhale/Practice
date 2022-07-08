package com.ebanking.test_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.ebanking.pom_class.LoginPage;

public class TC_SS1 extends BaseClass
{
	
	@Test
	public void LoginTest1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		int Case =1;
		log.info("test case : "+ Case);
		driver.get(URL);
		
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		
		log.info("user id entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
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
	@Test
	public void LoginTest2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		int Case =2;
		log.info("test case : "+ Case);
		driver.get(URL);
		
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		
		log.info("user id entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		
		
			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
	}
	@Test
	public void LoginTest3() throws InterruptedException, EncryptedDocumentException, IOException
	{
		int Case =3;
		log.info("test case : "+ Case);
		driver.get(URL);
		
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		
		log.info("user id entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		
		
			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
	}
	
	@Test
	public void LoginTest4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		int Case =4;
		log.info("test case : "+ Case);
		driver.get(URL);
		
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Case);
		
		log.info("user id entered ");
		lp.setPassword(Case);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		
		
			String ActText = driver.switchTo().alert().getText();
			String expected = "User or Password is not valid";
			
			Assert.assertEquals(ActText, expected);
	}
	

}
