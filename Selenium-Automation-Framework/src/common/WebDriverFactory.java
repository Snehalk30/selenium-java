package common;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	public static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();



}
