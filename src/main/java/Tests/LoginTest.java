package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void testLogin() throws InterruptedException {

		String email = "s.piedranavarro@gmail.com";
		String pwd = "12345678";

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(email, pwd);
	}
}
