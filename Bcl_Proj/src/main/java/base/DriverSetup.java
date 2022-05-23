package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public static WebDriver bcl;

	@BeforeSuite
	public static void driverOpen() {
		WebDriverManager.chromedriver().setup();
		bcl = new ChromeDriver();

	}

	@AfterSuite
	public static void driverClose() {
//	bcl.close();
//bcl.quit();
	}
}
