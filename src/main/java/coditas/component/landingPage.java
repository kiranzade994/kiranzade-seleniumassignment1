package coditas.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
WebDriver driver;
	
	
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}

public void login()
{
	@FindBy
	
	}

	public void goTo() 
	{
		driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
		
	}

}



