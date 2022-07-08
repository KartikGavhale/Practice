package com.ebanking.pom_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebanking.utility_class.Utility;

public class LoginPage 
{
	@FindBy(name="uid") @CacheLookup private WebElement userId ;
	@FindBy (name="password")@CacheLookup private WebElement pwd;
	@FindBy (name="btnLogin") @CacheLookup private WebElement LoginBTN;
	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUserName(int i) throws EncryptedDocumentException, IOException
	{
		userId.sendKeys(Utility.readXL(i,1));
	}
	
	public void setPassword(int j) throws EncryptedDocumentException, IOException
	{
		pwd.sendKeys(Utility.readXL(j,2));
	}
	public void Submit()
	{
		LoginBTN.click();
	}
}
