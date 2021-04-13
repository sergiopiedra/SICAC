package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	//@Test // HappyPath
	public void testLoginTrue() throws InterruptedException {

		String email = "s.piedranavarro@gmail.com";
		String pwd = "12345678";

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(email, pwd);
	}
	
	@Test // NoHappyPath
	public void testLoginFalse() throws InterruptedException {

		String email = "s.piedranavarro@gmail.com";
		String pwd = "asd12345";

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(email, pwd);
	}


}