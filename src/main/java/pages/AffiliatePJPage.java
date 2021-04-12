package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffiliatePJPage extends BasePage {

	@FindBy(id = "Em_nombre")
	WebElement textName;

	@FindBy(id = "Em_identificacion")
	WebElement textId;

	@FindBy(id = "Em_telefono")
	WebElement numPhoneNumber;

	@FindBy(id = "Em_correo")
	WebElement textMail;

	@FindBy(xpath = "//*[@id=\"select_canton\"]")
	WebElement btnCanton;

	@FindBy(xpath = "//*[@id=\"select_canton\"]/option[2]")
	WebElement optCanton;

	@FindBy(xpath = "//*[@id=\"select_distrito\"]")
	WebElement btnDistrict;

	@FindBy(xpath = "//*[@id=\"select_distrito\"]/option[4]")
	WebElement optDistrict;

	@FindBy(id = "Em_direccion")
	WebElement textAddress;

	@FindBy(xpath = "//*[@id=\"btnsiguiente\"]")
	WebElement btnNext;

	@FindBy(xpath = "//*[@id=\"id_unidad_productiva_em\"]")
	WebElement btnProductiveUnit;

	@FindBy(xpath = "//*[@id=\"id_unidad_productiva_em\"]/option[1]")
	WebElement productiveUnit;

	@FindBy(id = "prod_nombre_em")
	WebElement textProductName;

	@FindBy(id = "prod_nombre_em")
	WebElement textFieldNum;

	@FindBy(id = "prod_numero_plano_Em")
	WebElement textArchitectsNum;

	@FindBy(xpath = "//*[@id=\"btnenviar\"]")
	WebElement btnSubmit;

	public AffiliatePJPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doAffiliatePJ(String name, String id, String phoneNumber, String mail, String address,
			String productName, String FieldNum, String ArchitectsNum) throws InterruptedException {

		typeOnElement(textName, name);
		typeOnElement(textId, id);
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
		typeOnElement(textFieldNum, FieldNum);
		typeOnElement(textArchitectsNum, ArchitectsNum);
		clickOnElement(btnSubmit);

	}
}