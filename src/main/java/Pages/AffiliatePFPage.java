package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AffiliatePFPage {

	By byBtnIdType = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[1]/div[1]/div");
	By byIdType = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/select/option[3]");
	By byId = By.id("pe_identificacion");
	By byName = By.id("pe_nombre");
	By byLastName1 = By.id("pe_apellido1");
	By byLastName2 = By.id("pe_apellido2");
	By byBtnGender = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/select");
	By byGenderType = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/select/option[3]");
    By byDateOfBirth = By.id("pe_fecha_nacimiento"); 
    By byPhoneNumber = By.id("pe_telefono");
    By byMail = By.id("pe_correo");
    By byBtnCanton = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[1]/div/select");
	By byCanton = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[1]/div/select/option[2]");
	By byBtnDistrict = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[2]/div/select");
	By byDistrict = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[2]/div/select/option[2]");
	By byAddress = By.id("pe_direccion");
	By byBtnNext = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[4]/div/ul/li/span");
	By byBtnProductiveUnit = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[1]/div[1]/div/select");
	By byProductiveUnit = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[1]/div[1]/div/select/option[2]");
	By byProductName = By.id("prod_nombre_pe");
	By byBtnSubmit = By.xpath("/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[4]/div/ul/li[2]/button");
	
	WebDriver driver;

	public AffiliatePFPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void doAffiliatePF(String id, String name, String lName1, String lName2, String dateOfBirth, String phoneNumber
							 , String mail, String address, String productName) throws InterruptedException {
		
	
		WebElement BtnIdType = driver.findElement(byBtnIdType);
		BtnIdType.click();
		
		WebElement IdTypeSelect = driver.findElement(byIdType);
		IdTypeSelect.click();
		
		WebElement IdField = driver.findElement(byId);
		IdField.sendKeys(id);
		
		WebElement NameField = driver.findElement(byName);
		NameField.sendKeys(name);
		
		WebElement LastName1Field = driver.findElement(byLastName1);
		LastName1Field.sendKeys(lName1);
		
		WebElement LastName2Field = driver.findElement(byLastName2);
		LastName2Field.sendKeys(lName2);
		
		WebElement BtnGender = driver.findElement(byBtnGender);
		BtnGender.click();
		
		WebElement GenderTypeSelect = driver.findElement(byGenderType);
		GenderTypeSelect.click();
		
		WebElement DateOfBirthField = driver.findElement(byDateOfBirth);
		DateOfBirthField.sendKeys(dateOfBirth);
		
		WebElement PhoneNumberField = driver.findElement(byPhoneNumber);
		PhoneNumberField.sendKeys(phoneNumber);
		
		WebElement MailField = driver.findElement(byMail);
		MailField.sendKeys(mail);
		
		WebElement BtnCanton = driver.findElement(byBtnCanton);
		BtnCanton.click();
		
		WebElement CantonSelect = driver.findElement(byCanton);
		CantonSelect.click();
		
		WebDriverWait loadwait = new WebDriverWait(driver, 5);
		loadwait.until(ExpectedConditions.presenceOfElementLocated(byDistrict));
		
		WebElement BtnDistrict = driver.findElement(byBtnDistrict);
		BtnDistrict.click();
		
		WebElement DistrictSelect = driver.findElement(byDistrict);
		DistrictSelect.click();
		
		WebElement AddressField = driver.findElement(byAddress);
		AddressField.sendKeys(address);
		
		WebElement BtnNext = driver.findElement(byBtnNext);
		BtnNext.click();
		
		WebDriverWait loadwaitPU = new WebDriverWait(driver, 10);
		loadwaitPU.until(ExpectedConditions.presenceOfElementLocated(byBtnProductiveUnit));
		
		WebElement BtnProductiveUnit = driver.findElement(byBtnProductiveUnit);
		BtnProductiveUnit.click();
		
		WebElement ProductiveUnitSelect = driver.findElement(byProductiveUnit);
		ProductiveUnitSelect.click();
		
		WebElement ProductNameField = driver.findElement(byProductName);
		ProductNameField.sendKeys(productName);
		
		WebElement BtnSubmit = driver.findElement(byBtnSubmit);
		BtnSubmit.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
