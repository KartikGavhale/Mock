package java.main;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_mainpage 
{
	@FindBy (xpath="//*[@id='sciOutPut']") public WebElement Output_Box ;
	@FindBy (xpath="//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")public WebElement Equals ;
	@FindBy (xpath ="//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")private WebElement Addition ;
	@FindBy (xpath= "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")private WebElement Subtraction ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]")private WebElement Multiplication ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")private WebElement Division ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")public WebElement AC ;
	
	public POM_mainpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickN1(WebDriver driver ,int i) throws EncryptedDocumentException, IOException
	{
		
		int j = 0;
		
			Utitlity U = new Utitlity();
			String value = U.readXL(i, j);
			char[] ch = value.toCharArray();
			for(char c : ch)
			{
				String v = String.valueOf(c);
				U.PressKey(driver,v);
			}
		
	}
	public void ClickN2(WebDriver driver ,int i) throws EncryptedDocumentException, IOException
	{
		
		int j = 1;
		
			Utitlity U = new Utitlity();
			String value = U.readXL(i, j);
			char[] ch = value.toCharArray();
			for(char c : ch)
			{
				String v = String.valueOf(c);
				U.PressKey(driver,v);
			}
		
	}
	public void ClickOperation(int i) throws EncryptedDocumentException, IOException
	{
		
		int j = 2;
		String M = "Multiplication";
		String A = "Addition";
		String S = "Subtraction";
		String D = "Division";
		
			Utitlity U = new Utitlity();
			String value = U.readXL(i, j);
			if(value == M)
			{
				Multiplication.click();
			}
			if(value == A)
			{
				Addition.click();
			}
			if(value == S)
			{
				Subtraction.click();
			}
			if(value == D)
			{
				Division.click();
			}
		
	}
	public String ResultCheck(int i) throws EncryptedDocumentException, IOException
	{
		int j = 3;
		
		Utitlity U = new Utitlity();
		String value = U.readXL(i, j);
		return value;
		
		
	}
	
	
	
	
}
