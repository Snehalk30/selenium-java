package page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AdminPage {
	WebElement addUserButton;
	
	WebDriverWait wait;
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(),this);
		wait=new WebDriverWait(WebDriverFactory.driver.get(),Duration.ofSeconds(20));
	}
	
	public AddUserPage navigateToAddUserPage() {
		addUserButton.click();
		return new AddUserPage();
		
	}
	public AdminPage isPageLoaded()
	{
		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		return this;
		
	}
}
