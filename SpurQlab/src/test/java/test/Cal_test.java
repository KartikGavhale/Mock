package test;

import java.io.IOException;
import java.main.BaseClass;
import java.main.POM_mainpage;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cal_test extends BaseClass  
{
	@Test
	public void Main_page()
	{
		Start();
	}
	@Test
	public void test1() throws EncryptedDocumentException, IOException
	{
		 POM_mainpage PM = new  POM_mainpage(driver);
			for(int i = 0 ; i <4 ; i++ )
			{
				PM.ClickN1(driver, i);
				PM.ClickOperation(i);
				PM.ClickN2(driver, i);
				PM.Equals.click();
				SoftAssert soft =  new SoftAssert();
				String A = PM.Output_Box.getText();
				String B = PM.ResultCheck(i);
				soft.assertEquals(A, B);
				PM.AC.click();
			}
		
	}
	
}
