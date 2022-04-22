package page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class HomePage {
	@FindBy(id="welcome")
	WebElement welcomeText;
	@FindBy(id="menu_admin_viewAdminModule")
      WebElement adminTab;
	
	WebDriverWait wait;
	 
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(),this);
		wait=new WebDriverWait(WebDriverFactory.driver.get(),Duration.ofSeconds(20));
		
	}
	public HomePage verifyWelcomeText()
	
	{
		System.out.println(welcomeText.getText());
		return this;
		

}
	public AdminPage navigateToAdminPage() {
		adminTab.click();
		return new AdminPage().isPageLoaded();
		
	}
public HomePage isPageLoaded()
	
	{
		wait.until(ExpectedConditions.visibilityOf(welcomeText));
		wait.until(ExpectedConditions.visibilityOf(adminTab));
		
		return this;
		
		
	}
}
