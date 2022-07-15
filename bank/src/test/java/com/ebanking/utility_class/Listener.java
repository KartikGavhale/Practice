
package com.ebanking.utility_class;
import java.io.File;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener extends TestListenerAdapter
{
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	public void onTestStart(ITestResult tr)
	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport.html");
		try {
			spark.loadXMLConfig("./extent-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		extent.attachReporter(spark);
		System.out.println("Test Started");
	
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN) );
		
		System.out.println("Test failed");
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test Skipped");
	}
	public void onFinish(ITestResult tr)
	{
		extent.flush();
		
	}
	
	

}



