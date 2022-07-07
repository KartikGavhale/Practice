package com.ebanking.test_class;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.pom_class.LoginPage;

public class TC_SS1 extends BaseClass
{
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		driver.get(URL);
		
		log.info("url open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		
		log.info("user id entered ");
		lp.setPassword(password);
		log.info("password entered");
		lp.Submit();
		log.info("submit button clicked");
		
		System.out.println(driver.getTitle());
		
		
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
	

}
