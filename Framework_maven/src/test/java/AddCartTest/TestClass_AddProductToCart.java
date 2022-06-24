package AddCartTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import mainPage.*;
import product_page.SelectProduct;
import utility.Util;


public class TestClass_AddProductToCart extends BaseClass
{
	@BeforeClass
	public void mainpage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Page();
		Main_page mp = new Main_page(D);
		mp.verifyLogo();
	    Thread.sleep(2000);
		mp.LoginPage();
		mp.sendUN(Util.Data(2, 1));
		mp.sendPwd(Util.Data(2, 2));
	}
	@Test(priority=1)
	public void searchpage() throws InterruptedException, IOException
	{
		search S =new search(D);
		S.Search();
		Util.ScreenShot(D);
		S.item();
		Thread.sleep(2000);
	}	
	@Test(priority=2)
	public void switchpage() throws InterruptedException
	{
		Set<String> WH = D.getWindowHandles();
		System.out.println(WH);
		ArrayList<String> A =new ArrayList<String>();
		for(String Q : WH)
		{
			A.add(Q);
		}
		D.switchTo().window(A.get(1));
		
		Thread.sleep(2000);
		
	}
	@Test(priority=3)
	public void product() throws InterruptedException
	{
		SelectProduct SP = new SelectProduct(D);
		
		Thread.sleep(1000);
		SP.ToCart();
		D.close();
	}
	
//	@AfterClass
//	public void end()
//	{
//		Close();
//	}
	
}
