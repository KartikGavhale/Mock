package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util 
{
	
	public static String  Data (int row, int col) throws EncryptedDocumentException, IOException
	{
		String path = "D:\\aspire work\\Excel\\GRP15.xlsx";
		
		FileInputStream f = new FileInputStream(path);
		Workbook WB=WorkbookFactory.create(f);
		Sheet L = WB.getSheet("Sheet1");
		Cell cell =L.getRow(row).getCell(col);
		CellType form = cell.getCellType();
		String type = form.toString();
		String type1= "STRING" ;
		String type2= "NUMERIC" ;
		
		if(type == type1 )
		{
		String value = cell.getStringCellValue();
		return value;
		}else
		{
			if(type == type2)
		    {
			double num = cell.getNumericCellValue();
			long n = (long)num;
			String value =String.valueOf(n);
			return value ;
		}else 
		{
			boolean condition = cell.getBooleanCellValue();
			String value = String.valueOf(condition);
			return value;
		}
		}	
		
	}
	
	public static void ScreenShot(WebDriver D) throws IOException
	{
		Date date = new Date();
		TakesScreenshot SS = (TakesScreenshot)D;
		 File Actual_SS = SS.getScreenshotAs(OutputType.FILE);
		
		 String Store = "D:\\aspire work\\Selenium_SS\\" + date.toString().replace(":","_") + ".png" ;
		 File Actual_file = new File(Store);
		 FileHandler.copy(Actual_SS, Actual_file);
		
	}
	

}
