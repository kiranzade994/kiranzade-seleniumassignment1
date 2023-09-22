package coditas.OrangeHRM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEnd {

	@Test
	public void createEvent() {
		
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Coditas\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kiranzade-trials710.orangehrmlive.com");
				///login
				
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("g2U@oQKB3h");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				String Titleofthepage=driver.findElement(By.xpath("//div[text()='Employee Management']")).getText();
				Assert.assertEquals(Titleofthepage,"Employee Management");
				
				/*/Open onboarding page 
				driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Onboarding");
				   List<WebElement> menuelist= driver.findElements(By.xpath("//li[@class='menuSearchResultItem']"));
				  WebElement Menueresult= menuelist.stream().filter(menue->menue.getText().equals("Event")).findFirst().orElse(null);
				  Menueresult.click();*/
				  
				  
				  driver.findElement(By.xpath("(//span[contains(text(),'Onboarding')])[1]")).click();
			
				  driver.switchTo().frame(("noncoreIframe"));
				  driver.findElement(By.cssSelector("#addItemBtn i")).click();
				  
				  
				  driver.findElement(By.id("OhrmJob_name")).sendKeys("Kiranzade1");
				  
				  
			  
				 
				  
				  

			}

}
