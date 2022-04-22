package test;

import org.testng.annotations.Test;

import page.HomePage;
import page.LoginPage;

public class LoginTest {
	@Test(groups = {"Login","critical","Regression"},priority = 1)
	public void verifyAdminLoginSuccessful() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.login("admin","admin123");
		
		HomePage hp = new HomePage();
		hp.verifyWelcomeText();
	}
	//verify ESS login successful
	
	@Test(groups = {"Login","critical","Regression"})
	public void verifyESSLoginsuccessful() {
		LoginPage lp = new LoginPage();
		lp.login( "ess","ess123");
		
		HomePage hp = new HomePage();
		hp.verifyWelcomeText();
	}
	
	//verify ESS login unsuccesful
	
	@Test(groups = {"Login","critical","Regression"})
	public void verifyAdminLoginUn_sccessful()throws InterruptedException{
		LoginPage lp = new LoginPage();
		lp.login( "admin","admin1234");
		
		lp.verifyErrorMessage("Invalid credentials");
	}
	@Test(groups = {"Login","critical","Regression"})
	public void verifyloginUnsuccessfulWithEmptyUsername()throws InterruptedException{
		LoginPage lp = new LoginPage();
		lp.enterpassword("admin123");
		lp.verifyErrorMessage("Username cannot be empty");
	}
}
