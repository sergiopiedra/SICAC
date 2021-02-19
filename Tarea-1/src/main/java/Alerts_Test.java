import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Alerts_Test{
	public void Alerts_Test_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebDriverWait loadwait = new WebDriverWait(driver, 10);
		loadwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/h3")));

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		dropdown.click();
		
		Alert textAlertInsert = driver.switchTo().alert();
		textAlertInsert.sendKeys("Sergio Piedra");
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
}