package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffiliatePFPage extends BasePage {

	@FindBy(xpath = "//*[@id=\"tipo_ide\"]")
	WebElement btnIdType;

	@FindBy(xpath = "//*[@id=\"tipo_ide\"]/option[2]")
	WebElement idType;

	@FindBy(id = "pe_identificacion")
	WebElement textId;

	@FindBy(id = "pe_nombre")
	WebElement textName;

	@FindBy(id = "pe_apellido1")
	WebElement textLastName1;

	@FindBy(id = "pe_apellido2")
	WebElement textLastName2;

	@FindBy(xpath = "//*[@id=\"pe_s\"]")
	WebElement btnGender;

	@FindBy(xpath = "//*[@id=\"pe_s\"]/option[3]")
	WebElement genderType;

	@FindBy(id = "pe_fecha_nacimiento")
	WebElement textDateOfBirth;

	@FindBy(id = "pe_telefono")
	WebElement numPhoneNumber;

	@FindBy(id = "pe_correo")
	WebElement textMail;

	@FindBy(xpath = "//*[@id=\"select_canton\"]")
	WebElement btnCanton;

	@FindBy(xpath = "//*[@id=\"select_canton\"]/option[2]")
	WebElement optCanton;

	@FindBy(xpath = "//*[@id=\"select_distrito\"]")
	WebElement btnDistrict;

	@FindBy(xpath = "//*[@id=\"select_distrito\"]/option[2]")
	WebElement optDistrict;

	@FindBy(id = "pe_direccion")
	WebElement textAddress;

	@FindBy(xpath = "//*[@id=\"btnsiguiente\"]")
	WebElement btnNext;

	@FindBy(xpath = "//*[@id=\"select_unidadp\"]")
	WebElement btnProductiveUnit;

	@FindBy(xpath = "//*[@id=\"select_unidadp\"]/option[3]")
	WebElement productiveUnit;

	@FindBy(id = "prod_nombre_pe")
	WebElement textProductName;

	@FindBy(xpath = "//*[@id=\"btnenviar\"]")
	WebElement btnSubmit;

	public AffiliatePFPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doAffiliatePF(String id, String name, String lName1, String lName2, String dateOfBirth,
			String phoneNumber, String mail, String address, String productName) throws InterruptedException {

		clickOnElement(btnIdType);
		clickOnElement(idType);
		typeOnElement(textId, id);
		typeOnElement(textName, name);
		typeOnElement(textLastName1, lName1);
		typeOnElement(textLastName2, lName2);
		clickOnElement(btnGender);
		clickOnElement(genderType);
		typeOnElement(textDateOfBirth, dateOfBirth);
		typeOnElement(numPhoneNumber, phoneNumber);
		typeOnElement(textMail, mail);
		clickOnElement(btnCanton);
		clickOnElement(optCanton);
		clickOnElement(btnDistrict);
		clickOnElement(optDistrict);
		typeOnElement(textAddress, address);
		clickOnElement(btnNext);
		clickOnElement(btnProductiveUnit);
		clickOnElement(productiveUnit);
		typeOnElement(textProductName, productName);
		clickOnElement(btnSubmit);

	}
}
