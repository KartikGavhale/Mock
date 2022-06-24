package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{ 
	protected static WebDriver D = null;
	public static void Page()
	{
		String key = "webdriver.chrome.driver";
		String value ="D:\\softwares\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		 D= new ChromeDriver();
		D.get("https://www.amazon.in/");
		D.manage().window().maximize();
	}
	public static void Close()
	{
		D.quit();
	}

}

