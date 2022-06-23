package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility 
{
	public String readXL(int i , int j) throws EncryptedDocumentException, IOException
	{
		String path = "D:\\aspire work\\Excel\\SpurQLab.xlsx";
		FileInputStream f = new FileInputStream(path);
		
		Sheet S =WorkbookFactory.create(f).getSheet("Sheet1"); 
		Cell cell =S.getRow(i).getCell(j);
		CellType celltype = cell.getCellType();
		String type = celltype.toString();
		String type1 = "STRING";
		@SuppressWarnings("unused")
		String type2 = "NUMERIC";
		if(type==type1)
		{
			String value = cell.getStringCellValue();
			return value;
		}else
		{
			double d = cell.getNumericCellValue();
			long l = (long)d ;
			String value = String.valueOf(l);
			return value;
		}
	}

	
	
	
	public void PressKey(WebDriver driver , String a)
	{
		String beforRow = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[";
		String beforCol = "]/span[";
		String after = "]";
	for(int i=1 ; i<=5 ; i ++)
	{
		
		for(int j = 1 ; j<=5 ; j++)
		{
			String xpath = beforRow + i +beforCol+ j + after;
			WebElement buttons= driver.findElement(By.xpath(xpath));
			if (a.equals(buttons.getText()))
			{
				buttons.click();
				break;
			}
		}
	}

	}

}
