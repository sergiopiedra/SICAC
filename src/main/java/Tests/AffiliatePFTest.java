package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AffiliatePFPage;
import Pages.BasePage;

public class AffiliatePFTest extends BaseTest {

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://165.232.130.15/formulariopersona/create");
		driver.manage().window().fullscreen();
	}
	
	@BeforeMethod
	public void verifyHomePage() {
		System.out.println("Page verify test");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyAffiliatePFTitle(), "Page title doesn't match");
	}
	
	@Test
	public void testAffiliatePF() throws InterruptedException {

		String id = "202220222";
		String name = "Jose";
		String lName1 = "Gonzalez";
		String lName2 = "Ramirez";
		String dateOfBirth = "20-08-2000";
		String phoneNumber = "12345678";
		String mail = "test@test.com";
		String address = "200 meter ...";
		String productName = "WaterMelon";

		AffiliatePFPage affiliatePFPage = new AffiliatePFPage(driver);
		affiliatePFPage.doAffiliatePF(id, name, lName1, lName2, dateOfBirth, phoneNumber, mail, address, productName);

	}
}
