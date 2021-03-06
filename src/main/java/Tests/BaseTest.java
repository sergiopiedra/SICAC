package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://165.232.130.15/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeApplication() {
		driver.quit();
		Reporter.log("-Browser Session End-", true);
	}
}
