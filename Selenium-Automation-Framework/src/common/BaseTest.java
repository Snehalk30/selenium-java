package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {
	@DataProvider(name="LoginData")
	public String[][] getLoginData()
	{
		String[][] loginData = {
				{"admin","admin123"},//loginData>0th index
				
				{"ess","ess123"}//loginData>1st index
				};
		return loginData;
		/*
		  loginData[0][0]=admin
		   loginData[0][1]=admin123
		   loginData[1][0]=ess
		   loginData[1][1]=ess123
		   
		  	 */
		
	}
	
	@DataProvider(name="LoginDataFromCSV")
	public String[][] getLoginDataFromCSV() throws IOException 
	{
		
	String [][]loginData = new String[2][3];
	File file = new File("C:/Users/lenovo/Downloads/Test.csv");
	
FileReader fr;
try{
	fr= new FileReader(file);

	
	BufferedReader br = new BufferedReader(fr);

String st;
int i=0;

while ((st = br.readLine()) != null)
{
	loginData[i]=st.split(",");
	i=i+1;
	
}
return loginData;
}
catch(FileNotFoundException e)

{
	


System.out.println("Unable to find file Test.csv,please check the path and try again");
e.printStackTrace();

}
return null;
}
	

		
		





@BeforeMethod
		public void brforeEveryTest()
		{
			System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
			WebDriverFactory.driver.set(new ChromeDriver());
			WebDriverFactory.driver.get().manage().window().maximize();
			 WebDriverFactory.driver.get().get("https://opensorce-demo.orangehrmlive.com/index.php/auth/login");

		}
		
		@AfterMethod
	public void afterEveryTest() {
			WebDriverFactory.driver.get().quit();
		}


}



