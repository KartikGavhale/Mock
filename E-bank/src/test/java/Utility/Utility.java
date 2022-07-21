package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	public String readXL(int i , int  j) throws EncryptedDocumentException, IOException
	{
		String path = "./Data/e_banking.xlsx";
		File src = new File(path);
		FileInputStream f = new FileInputStream(src);

		
		Sheet sh =WorkbookFactory.create(f).getSheet("Sheet1");
		
		Cell cell = sh.getRow(i).getCell(j);
		CellType type = cell.getCellType();
		String type1 = type.toString();
		if(type1=="STRING")
		{
			String value =cell.getStringCellValue();
			return value ;
		}else
			{if(type1=="NUMERIC")
			 {
				double val = cell.getNumericCellValue();
				long valu = (long)val;
				String value = String.valueOf(valu);
				return value;
			 }else 
				{
				boolean val = cell.getBooleanCellValue();
				String value = String.valueOf(val);
				return value;
				}
			}
	}
	
	
	public void writeXL(int i, int j,String value) throws EncryptedDocumentException, IOException
	{
		String path = "./Data/e_banking.xlsx";
		File src = new File(path);
		FileInputStream f = new FileInputStream(src);
		Workbook WB =WorkbookFactory.create(f); 
		Sheet sh =WB.getSheet("Sheet2");
		
		Row row = sh.createRow(i);
		Cell col = row.createCell(j);		
		col.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(src);
		WB.write(fo);
				
	}
	
	public String getEmail()
	{
		
		String preffix=RandomStringUtils.randomAlphabetic(5, 10);
		
		List<String> AT = new ArrayList<>();
		AT.add("@gmail.com");
		AT.add("@outlook.com");
		AT.add("@yahoo.com");
		Random r =new Random();
		int index = r.nextInt(3);
		
		String suffix = AT.get(index);
		String mail = preffix+suffix;
		
		return mail;
	}
	public String getNumber()
	{
		String num = RandomStringUtils.randomNumeric(10);
		
		return num;
	}
	
	
}
