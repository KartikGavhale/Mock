package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM.DashBoard;
import POM.LoginPage;
import Utility.DataProvider1;

public class LoginTest extends BaseClass
{
	LoginPage loginPage;
	DashBoard dashBoard;
		
//	@Test
//	public void logincheck()
//	{
//		loginPage=new LoginPage(driver);
//	    loginPage.autoEnter();
//	}
	
	@Test(dataProvider = "xldata", dataProviderClass = DataProvider1.class)
	public void logincheck(String user, String Pass)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		loginPage =new LoginPage(driver);
		loginPage.setUser(user);
		loginPage.setPass(Pass);
		loginPage.submit();
		try 
		{
			driver.switchTo().alert();
			Alert a = driver.switchTo().alert();
			System.out.println("Entered wrong credentials");
			String alertText =a.getText();
			if(alertText.equals("User or Password is not valid"));
			{
				System.out.println("Alert Popup passed");
			}
			a.accept();
		}catch( NoAlertPresentException e)
		{
			System.out.println("Login succesfull");
			dashBoard = new DashBoard(driver);
			dashBoard.logout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
		
	}
}
