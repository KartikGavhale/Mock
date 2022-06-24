package cart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart 
{
	@FindBy (xpath ="(//div[@data-name='Active Items'])//input[@value='Delete']")private WebElement delete ;
	@FindBy (xpath ="(//div[@data-name='Active Items'])//input[@value='Delete']") private  List<WebElement>  count ;

	public Cart(WebDriver D)
    {
    	PageFactory.initElements(D , this);
    }
	public void deleteBTN() throws InterruptedException
	{
		int n =count.size();
		
		for(int i =0 ; i<=n-1 ;i++)
		{
			delete.click();
			Thread.sleep(500);
			System.out.println("deleted item count :"+ i);
		}
	}
}
