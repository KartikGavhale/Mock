package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	protected WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser)
	{
		String br = browser;
		if(br.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
			if(br.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			if(br.equals("Edge"))
			{
				System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe");
				driver = new EdgeDriver();
			}
		
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		
	}
	

	
	
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5500);
		driver.quit();
	}

}
