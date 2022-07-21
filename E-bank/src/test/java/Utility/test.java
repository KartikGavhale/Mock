package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String path = "./Data/e_banking.xlsx";
		File src = new File(path);
		FileInputStream f = new FileInputStream(src);
		Workbook WB =WorkbookFactory.create(f); 
		try {
			System.out.println("in try block");
		Sheet sh =WB.getSheet("Sheet1");
		
		CellType cell = sh.getRow(0).getCell(0).getCellType();
		
		}catch(NullPointerException e)
		{
			System.out.println("in catch block");
			Sheet sh =WB.getSheet("Sheet1");
			
			CellType cell = sh.getRow(0).getCell(0).getCellType();
			
			
		}
	}

}
