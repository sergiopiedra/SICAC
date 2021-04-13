package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AffiliatePJPage;
import pages.BasePage;


public class AffiliatePJTest extends BaseTest {

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://165.232.130.15/formularioempresa/create");
		driver.manage().window().fullscreen();
	}

	@BeforeMethod
	public void verifyHomePage() {
		System.out.println("Page verify test");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyAffiliatePFTitle(), "Page title doesn't match");
	}

	@Test
	public void testAffiliatePJ() throws InterruptedException {

		String name = "MCC";
		String id = "102220222";
		String phoneNumber = "12345678";
		String mail = "test@test.com";
		String address = "200 metros este del CACN";
		String productName = "Teca";
		String FieldNum = "1002502111";
		String ArchitectsNum = "88888888";

		AffiliatePJPage affiliatePJPage = new AffiliatePJPage(driver);
		affiliatePJPage.doAffiliatePJ(name, id, phoneNumber, mail, address, productName, FieldNum, ArchitectsNum);

	}
}