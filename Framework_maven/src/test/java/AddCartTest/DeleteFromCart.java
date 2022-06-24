package AddCartTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import cart.Cart;
import mainPage.Main_page;
import utility.Util;

public class DeleteFromCart extends BaseClass 
{
	@BeforeClass
	public void Main_Page()
	{
		Page();
	}
	@Test(priority=1)
	public void ToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Main_page mp=new Main_page(D);
		Thread.sleep(2000);
		mp.LoginPage();
		mp.sendUN(Util.Data(2, 1));
		mp.sendPwd(Util.Data(2, 2));
		mp.cart();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void DeleteItem() throws InterruptedException
	{
		Cart ct = new Cart(D);
//		WebDriverWait w = new WebDriverWait(D, Duration.ofSeconds(3));
//		w.until(ExpectedConditions.elementToBeClickable(Cart.delete));
		ct.deleteBTN();
	}
	
	
	

}
