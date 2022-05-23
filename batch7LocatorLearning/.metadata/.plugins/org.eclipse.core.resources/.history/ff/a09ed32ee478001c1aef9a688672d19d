package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup  {
	public static WebDriver zbr;
	
	@BeforeSuite
	public static void OpenDriver() 
	{
		WebDriverManager.chromedriver().setup();
		
		zbr=new ChromeDriver();
	}

	@AfterSuite
	public static void CloseDriver()
	{ 
	
	zbr.close();
	//zbr.quit();
	
	}
}
