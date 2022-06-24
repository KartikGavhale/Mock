package product_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct 
{
	@FindBy (xpath="(//div[@class='a-section'])[19]//li[6]") private WebElement Size;
	@FindBy (xpath="//input[@name='submit.add-to-cart']") private WebElement AddToCart ;
	
	public SelectProduct(WebDriver D)
	{
		PageFactory.initElements(D , this);
	}
	public void SelectSize()
	{
		Size.click();
	}
	public void ToCart()
	{
		AddToCart.click();
	
	}
	
}
