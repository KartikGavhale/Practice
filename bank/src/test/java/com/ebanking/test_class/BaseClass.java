package com.ebanking.test_class;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	String URL = "https://www.demo.guru99.com/V4/";
	String userName = "mngr422966";
	String password = "vyvAbag";
	WebDriver driver ;
	public  Logger log ;
	@BeforeClass
	public void setUp()
	{
		String key = "webdriver.gecko.driver";
		String value = System.getProperty("user.dir")+"//Driver//geckodriver.exe";
		System.setProperty(key, value);
		driver = new FirefoxDriver();
		
		 log = Logger.getLogger("bank");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void end() 
	{
	
		driver.quit();
	}
	

}
