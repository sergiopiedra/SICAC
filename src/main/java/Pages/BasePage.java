package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickOnElement(WebElement element) {
		waitVisibility(element);
		element.click();
	}

	public void typeOnElement(WebElement element, String text) {
		waitVisibility(element);
		element.sendKeys(text);
	}

	public void acceptAlert() throws NotFoundException {
		final Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
	}
}