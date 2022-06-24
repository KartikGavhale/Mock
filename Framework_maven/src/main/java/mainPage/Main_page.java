package mainPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_page 
{
	@FindBy (xpath="//a[@id='nav-logo-sprites']") private  WebElement logo ;
    @FindBy (xpath = "(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]") private WebElement Login ;
    @FindBy (id="ap_email")private WebElement UserName ;
    @FindBy (id="ap_password")private WebElement Password ;
    @FindBy (id="signInSubmit") private WebElement Submit ;
    @FindBy (xpath = "//a[@id='nav-cart']")private WebElement CartSign;
    
    public Main_page(WebDriver D)
    {
    	PageFactory.initElements(D , this);
    }
    
    public void verifyLogo()
    {
    	@SuppressWarnings("unused")
		Boolean LogoStatus =logo.isDisplayed();
    	if(LogoStatus = true)
    	{
    		System.out.println("Logo verified");
    	}else {
    		System.out.println("Logo Verification failed");
    	}
    }
    public void LoginPage() throws InterruptedException
    {
    	Login.click();
    	Thread.sleep(1000);
    }
    public void sendUN(String USN) throws InterruptedException
    {
    	UserName.sendKeys(USN+ Keys.ENTER);
    	Thread.sleep(1000);
    }
    public void sendPwd(String password)
    {
    	Password.sendKeys(password);
    	Submit.click();
    }

    public void cart()
    {
    	CartSign.click();
    }
    
    
}
