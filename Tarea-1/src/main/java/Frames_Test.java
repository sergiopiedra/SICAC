
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Frames_Test {
	public void Frames_Test_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		String mail="bestmail@ever.com";
		String pass="root";
		
		driver.switchTo().frame("result");
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("pwd")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div/div[3]/label/input")).click();
		driver.findElement(By.xpath("/html/body/div/button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
}