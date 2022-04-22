package test;

import org.testng.annotations.Test;

import page.LoginPage;

public class AddUserTest {

@Test
public void verifyAddUserSuccesful()throws InterruptedException
{
         new LoginPage()
                     .login("admin","admin123")
                    .verifyWelcomeText()
	              .navigateToAdminPage()
	                 .navigateToAddUserPage()
	                  .addUser("Admin","SPG","Snehal","password","password");
}
}
