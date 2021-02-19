

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Windows_Test {
	public void Windows_Test_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.cr/");

		String a = "window.open('https://www.facebook.com/','_blank');";
		((JavascriptExecutor)driver).executeScript(a);
		
		driver.close();
	}
}