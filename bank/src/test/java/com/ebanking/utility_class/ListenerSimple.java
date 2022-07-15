package com.ebanking.utility_class;

import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerSimple extends TestListenerAdapter
{	WebDriver driver ;

	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test Started ----------");
		
		
	}
	public void onTestSuccess(ITestResult tr)
	{
		try {
			Utility.SS(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
