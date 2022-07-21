package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard 
{	
	@FindBy (xpath="//a[contains(text(),'Log out')]")
	WebElement signout;
	
	
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void logout()
	{
		signout.click();
	}
}
