package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.BasePage;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://165.232.130.15/");
		driver.manage().window().fullscreen();
	}

	@BeforeMethod
	public void verifyHomePage() {
		System.out.println("Page verify test");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Page title doesn't match");
	}

	@AfterMethod
	public void closeApplication() {
		driver.quit();
		Reporter.log("-Browser Session End-", true);
	}
}
