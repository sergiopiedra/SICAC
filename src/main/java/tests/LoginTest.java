package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class LoginTest {

	@Test
	public void testLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://165.232.130.15/"); 
		
		String email = "s.piedranavarro@gmail.com";
		String pwd = "12345678";
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(email, pwd);
	}

}
