package com.ebanking.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public void setUserName(String username)
	{
		userId.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pwd.sendKeys(password);
	}
	public void Submit()
	{
		LoginBTN.click();
	}
}
