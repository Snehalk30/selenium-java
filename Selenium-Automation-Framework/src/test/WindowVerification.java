package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.WebDriverFactory;

public class WindowVerification {
	@Test
	public void printWindowTitle()
	{
		ChromeDriver driver = WebDriverFactory.driver.get();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt=' OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt=' OrangeHRM twitter']")).click();
		driver.findElement(By.xpath("//img[@alt=' OrangeHRM on youtube']")).click();
		
		Set<String>windowHandles = driver.getWindowHandles();
		 for (String window : windowHandles)
		 {
			 driver.switchTo().window(window);
			 System.out.println(driver.getTitle());
		 }
		
		
		
	}

}



