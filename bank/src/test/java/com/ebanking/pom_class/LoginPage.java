package com.ebanking.pom_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebanking.utility_class.Utility;

public class LoginPage 
{
	@FindBy(name="uid")  public WebElement userId ;
	@FindBy (name="password") private WebElement pwd;
	@FindBy (name="btnLogin")  private WebElement LoginBTN;
	@FindBy (xpath="/html/body/div[3]/div/ul/li[15]/a") private WebElement Logout;
	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUserNameD(int i) throws EncryptedDocumentException, IOException
	{
		userId.sendKeys(Utility.readXL(i,0));
	}
	
	public void setPasswordD(int j) throws EncryptedDocumentException, IOException
	{
		pwd.sendKeys(Utility.readXL(j,1));
	}
	public void Submit()
	{
		LoginBTN.click();
	}
	
	public void setUserName(String use)	
	{
		userId.sendKeys(use);
	}
	
	public void setPassword(String pas)
	{
		pwd.sendKeys(pas);
	}
	
	public void out()
	{
		Logout.click();
	}
}
