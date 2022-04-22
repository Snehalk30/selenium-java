package page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name['txtttusername']")WebElement userName;
	@FindBy(id="txtpassword")
	WebElement password;
	
	@FindBy(id="Submit")
	WebElement loginButton;
	
	@FindBy(id="spanMessage")
	WebElement errorMessage;
	
	WebDriverWait wait;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(),this);
		
		wait=new WebDriverWait(WebDriverFactory.driver.get(),Duration.ofSeconds(20));
		
	}
	public HomePage login(String strUserName,String strPassword)
	{
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		
		/*try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		HomePage hp = new HomePage().isPageLoaded();
		return hp;
	}
	public LoginPage loginForUnsuucessful(String strUserName,String strPassword)
	{
		login(strUserName, strPassword);
		return this;
	}
	public LoginPage enterUserName(String strUserName)
	
	{
		userName.sendKeys(strUserName);
		loginButton.click();
		return null;
	}
	public void enterpassword(String strPassword)
	{
		password.sendKeys(strPassword);
		loginButton.click();
	}
	public LoginPage verifyErrorMessage(String message)
	{
		/*
		if(errorMessage.getText().contains(message))
				System.out.println("PASS");
		else
			System.out.println("FAIL");
	*/
		Assert.assertNotEquals(errorMessage.getText(),message,"Welcome text is not displays as per expectation");
		
		return this;
		
		
	}
	public LoginPage isPageLoaded()
	
	{
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		
		return this;
		
		
	}}
