package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(xpath = "/html/body/header/div[2]/div[1]/div/div[2]/div[2]/a")
	WebElement BtnIngresar;

	@FindBy(id = "email")
	WebElement TextEmail;

	@FindBy(id = "password")
	WebElement TextPass;

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/form/div[3]/button")
	WebElement BtnIniciar;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String email, String pwd) {

		clickOnElement(BtnIngresar);
		typeOnElement(TextEmail, email);
		typeOnElement(TextPass, pwd);
		clickOnElement(BtnIniciar);
	}
}