package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{  
	Properties pro;
	public ReadConfig() 
	{
		File src = new File("./Data/data.properties");
		
		FileInputStream f;
		try {
			f = new FileInputStream(src);
			 pro = new Properties();
				pro.load(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	}
	
	public String getUrl()
	{
		String value = pro.getProperty("baseURL");
		return value ;
	}
	public String getuser()
	{
		String value = pro.getProperty("Username");
		return value ;
	}
	public String getpswd()
	{
		String value = pro.getProperty("Password");
		return value ;
	}
	public String getchrome()
	{
		String value = pro.getProperty("chromepath");
		return value ;
	}
	public String getfirefox()
	{
		String value = pro.getProperty("firefoxpath");
		return value ;
	}
	public String getedge()
	{
		String value = pro.getProperty("edgepath");
		return value ;
	}
	

}
