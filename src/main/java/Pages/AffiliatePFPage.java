package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffiliatePFPage extends BasePage {

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[1]/div[1]/div")
	WebElement BtnIdType;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/select/option[3]")
	WebElement IdType;

	@FindBy(id = "pe_identificacion")
	WebElement TextId;

	@FindBy(id = "pe_nombre")
	WebElement TextName;

	@FindBy(id = "pe_apellido1")
	WebElement TextLastName1;

	@FindBy(id = "pe_apellido2")
	WebElement TextLastName2;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/select")
	WebElement BtnGender;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/select/option[3]")
	WebElement GenderType;

	@FindBy(id = "pe_fecha_nacimiento")
	WebElement TextDateOfBirth;

	@FindBy(id = "pe_telefono")
	WebElement NumPhoneNumber;

	@FindBy(id = "pe_correo")
	WebElement TextMail;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[1]/div/select")
	WebElement BtnCanton;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[1]/div/select/option[2]")
	WebElement OptCanton;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[2]/div/select")
	WebElement BtnDistrict;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[3]/div[1]/div[5]/div[2]/div/select/option[2]")
	WebElement OptDistrict;

	@FindBy(id = "pe_direccion")
	WebElement TextAddress;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[1]/div/div[4]/div/ul/li/span")
	WebElement BtnNext;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[1]/div[1]/div/select")
	WebElement BtnProductiveUnit;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[1]/div[1]/div/select/option[2]")
	WebElement ProductiveUnit;

	@FindBy(id = "prod_nombre_pe")
	WebElement TextProductName;

	@FindBy(xpath = "/html/body/div/div[3]/div[3]/div[2]/div/form/div[2]/div/div[3]/div/div[4]/div/ul/li[2]/button")
	WebElement BtnSubmit;

	WebDriver driver;

	public AffiliatePFPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doAffiliatePF(String id, String name, String lName1, String lName2, String dateOfBirth, String phoneNumber
							 , String mail, String address, String productName) throws InterruptedException {
		
	
		clickOnElement(BtnIdType);
		clickOnElement(IdType);
		typeOnElement(TextId, id);
		typeOnElement(TextName, name);
		typeOnElement(TextLastName1,lName1);
		typeOnElement(TextLastName2, lName2);
		clickOnElement(BtnGender);
		clickOnElement(GenderType);
		typeOnElement(TextDateOfBirth, dateOfBirth);	
		typeOnElement(NumPhoneNumber, phoneNumber);	
		typeOnElement(TextMail, mail);
		clickOnElement(BtnCanton);
		clickOnElement(OptCanton);
		clickOnElement(BtnDistrict);
		clickOnElement(OptDistrict);
		typeOnElement(TextAddress, address);
		clickOnElement(BtnNext);
		clickOnElement(BtnProductiveUnit);
		clickOnElement(ProductiveUnit);
		typeOnElement(TextProductName, productName);
		clickOnElement(BtnSubmit);
		acceptAlert();
	}
}
