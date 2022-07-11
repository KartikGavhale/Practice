package com.ebanking.test_class;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ebanking.utility_class.ReadConfig;

public class BaseClass 
{
	ReadConfig rc = new ReadConfig();
	String URL = rc.getURL();
	WebDriver driver ;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("./target/ExtentReport.html");
	public  Logger log ;
	@BeforeClass
	public void setUp()
	{
		String key = "webdriver.gecko.driver";
		String value = "./Driver//geckodriver.exe";
		System.setProperty(key, value);
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		 log = Logger.getLogger("bank");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass(enabled=false)
	public void end() 
	{
	
		driver.quit();
	}
	
	@BeforeTest
	public void beforeTest()
	{
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Ebank_report");
		spark.config().setReportName("E_bankTest");
		
		extent.attachReporter(spark);
		
		

	}
	@AfterTest
	public void afterTest()
	{
		extent.flush();
	}
	

}
