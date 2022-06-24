package mainPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search
{
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']") private WebElement Searchbox ;
	@FindBy (xpath="(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]//a") private WebElement product ;

	public search(WebDriver D)
	{
		PageFactory.initElements(D, this);
	}
	
	public void Search()
	{
		Searchbox.sendKeys("pen drive" + Keys.ENTER);
	}	
	public void item() throws InterruptedException
	{
		String P = product.getText();
		System.out.println(P);
		product.click();
	}
}
