package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvider1 
{
	@DataProvider(name="xldata")
	String [][] getData() throws EncryptedDocumentException, IOException
	{
		String path = "./Data//e_banking.xlsx";

		File f = new File(path);
		Sheet sh =WorkbookFactory.create(f).getSheet("Sheet1");
		int rows = sh.getLastRowNum(); //5
		int col = sh.getRow(0).getLastCellNum(); //2
		String[][] data = new String[rows][col];
		for(int i = 1  ; i<=rows ; i++)
		{
			for(int j = 0; j<col;j++)
			{
				data [i-1][j] = sh.getRow(i).getCell(j).getStringCellValue(); 
			}
		}
		return data;
	}

}
