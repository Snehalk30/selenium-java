package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.WebDriverFactory;

public class LinkVerification {
	public void printAllLinks() throws InterruptedException
	{
		
	
     WebDriver driver = WebDriverFactory.driver.get();
     
     Thread.sleep(15000);
     
	//List<WebElement>links = driver.findElements(By.tagName("a"));
	List<WebElement>links = driver.findElements(By.xpath("//*[@href]"));
	
	
	for(WebElement link:links)
	{
		System.out.println(links.get(0).getAttribute("href"));
	}
			
	
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getAttribute("href"));
	}
	
	
	
	
	

}


}
