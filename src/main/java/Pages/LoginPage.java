package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	By byBtnIngresar = By.xpath("/html/body/header/div[2]/div[1]/div/div[2]/div[2]/a");
	By byEmail = By.id("email");
	By byPass = By.id("password");
	By byBtnIniciar = By.xpath("//*[@id=\"app\"]/main/div/div/div/form/div[3]/button");
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doLogin(String email, String pwd) {
		
		WebElement btnIngresar = driver.findElement(byBtnIngresar);
		btnIngresar.click();
		
		WebElement emailField = driver.findElement(byEmail);
		emailField.sendKeys(email);
		
		WebElement passwordField = driver.findElement(byPass);
		passwordField.sendKeys(pwd);
		
		WebElement btnIniciar = driver.findElement(byBtnIniciar);
		btnIniciar.click();
	}

}
