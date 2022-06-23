package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pom.MainPage;

public class test1 extends BaseClass 
{
	@BeforeMethod
	public void open()
	{
		Start();
		System.out.println("test start passed");
	}
	
	@Test(priority =2, enabled= true)
	public void T1() throws EncryptedDocumentException, IOException
	{
		for(int i=1 ; i<4 ; i++)
		{
		MainPage Mp = new MainPage(driver);
		Mp.ClickN1(driver, i);
		Mp.ClickOperation(i);
		Mp.ClickN2(driver, i);
		Mp.Equals.click();
		String A = Mp.Output_Box.getText();
		String B = Mp.ResultCheck(i);
		SoftAssert S = new SoftAssert();
		S.assertEquals(A, B);
		System.out.println("Test for Expression "+i+ " passed");
		Mp.AC.click();
		}
	}
	
	@AfterMethod
	public void cls()
	{
		Close();
	}


}
