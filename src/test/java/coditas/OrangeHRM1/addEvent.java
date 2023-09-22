package coditas.OrangeHRM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addEvent {
	@Test
	public void createEvent() {
		
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Coditas\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
				//driver.findElement(By.id("txtUsername")).sendKeys(args)

			}
	}


