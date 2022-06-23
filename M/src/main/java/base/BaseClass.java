package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	protected WebDriver driver ;
	public void Start()
	{
		String Key = "webdriver.chrome.driver";
		String Value = "D:\\softwares\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(Key, Value);
		 driver = new ChromeDriver();
		String URL ="https://www.calculator.net/";
		driver.get(URL);
	}
	public void Close()
	{
		driver.close();
	}

}
