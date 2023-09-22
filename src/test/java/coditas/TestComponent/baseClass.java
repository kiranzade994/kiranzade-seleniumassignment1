package coditas.TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import coditas.component.landingPage;

public class baseClass {
	WebDriver driver;
	landingPage landingpage;

	
	public WebDriver intializDriver() throws IOException
	{
		Properties prop=new 	Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Coditas\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\coditascompany\\resource\\GlobalData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Coditas\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;

}
	public landingPage launchApplication() throws IOException
	{

		
		driver=intializDriver();
		
		 landingpage.goTo();
		return landingpage ;
	}
}
