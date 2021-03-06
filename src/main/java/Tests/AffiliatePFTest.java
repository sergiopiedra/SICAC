package Tests;

import org.testng.annotations.Test;

import Pages.AffiliatePFPage;

public class AffiliatePFTest extends BaseTest {

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
