package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="uid")  public WebElement userId ;
	@FindBy (name="password") private WebElement pwd;
	@FindBy (name="btnLogin")  private WebElement LoginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public void setUser(String user)
	{
		userId.clear();
		userId.sendKeys(user);
	}
	public void setPass(String Pass)
	{
		pwd.clear();
		pwd.sendKeys(Pass);
	}
	public void submit()
	{
		LoginBTN.click();
//		return new DashBoard();
	}
	public void autoEnter()
	{
		userId.clear();
		userId.sendKeys("mngr422966");
		pwd.clear();
		pwd.sendKeys("vyvAbag");
		LoginBTN.click();
	}

}
