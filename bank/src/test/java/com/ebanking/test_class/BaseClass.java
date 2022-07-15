package com.ebanking.test_class;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.ebanking.utility_class.ReadConfig;

public class BaseClass 
{
	ReadConfig rc = new ReadConfig();
	String URL = rc.getURL();
	WebDriver driver ;
	
	public  Logger log ;
	@BeforeClass
	public void setUp()
	{
		String key = "webdriver.gecko.driver";
		String value = "./Driver//geckodriver.exe";
		System.setProperty(key, value);
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
		 log = Logger.getLogger("bank");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void end() 
	{
	
		driver.close();
	}
	
	
	

}
