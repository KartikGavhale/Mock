package pom;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utility;

public class MainPage 
{
	@FindBy (xpath="//*[@id='sciOutPut']") public WebElement Output_Box ;
	@FindBy (xpath="//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")public WebElement Equals ;
	@FindBy (xpath ="//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")public WebElement Addition ;
	@FindBy (xpath= "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")public WebElement Subtraction ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]")public WebElement Multiplication ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")public WebElement Division ;
	@FindBy (xpath = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")public WebElement AC ;
	
	public MainPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickN1(WebDriver driver ,int i) throws EncryptedDocumentException, IOException
	{
		
		int j = 0;
		Utility U = new Utility();
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
		
			Utility U = new Utility();
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
		
			Utility U = new Utility();
			String value = U.readXL(i, j);
			
			
			if(value.equalsIgnoreCase(M))
			{
				Multiplication.click();
			}
			if(value.equalsIgnoreCase(A))
			{
				Addition.click();
			}
			if(value.equalsIgnoreCase(S))
			{
				Subtraction.click();
			}
			if(value.equalsIgnoreCase(D))
			{
				Division.click();
			}
		
	}
	public String ResultCheck(int i) throws EncryptedDocumentException, IOException
	{
		int j = 3;
		
		Utility U = new Utility();	
		String value = U.readXL(i, j);
		return value;
		
		
	}

}
