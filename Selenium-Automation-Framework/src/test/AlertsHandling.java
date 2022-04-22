package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.WebDriverFactory;

public class AlertsHandling {
	@Test
	public AlertsHandling()
	{
		
	
		ChromeDriver driver = WebDriverFactory.driver.get();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().getText();
		
		
	}
}
