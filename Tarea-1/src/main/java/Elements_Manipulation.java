
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Elements_Manipulation {
	public void Elements_Manipulation_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		String n1="20";
		String n2="5";
		
		
		WebDriverWait loadwait = new WebDriverWait(driver, 5);
		loadwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"page-top\"]/header/div/div/div[1]")));
		
		WebElement number1 = driver.findElement(By.id("number1Field"));
		number1.sendKeys(n1);
		
		WebElement number2 = driver.findElement(By.id("number2Field"));
		number2.sendKeys(n2);
		
		WebElement action = driver.findElement(By.id("selectOperationDropdown"));
		action.click();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[2]"));
		dropdown.click();
		
		WebElement CalculateBTN = driver.findElement(By.id("calculateButton"));
		CalculateBTN.click();
	}
}