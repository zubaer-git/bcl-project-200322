package testCase;

import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_05_Refresh extends DriverSetup {
	static String baseUrl="https://rahulshettyacademy.com/locatorspractice/#";
	
	
	@Test
			public static void refresh() throws InterruptedException 
			{
				zbr.get(baseUrl);
				zbr.manage().window().maximize();
				Thread.sleep(2000);
				
				zbr.navigate().to("https://www.google.com/");
				Thread.sleep(2000);
				zbr.navigate().back();
				Thread.sleep(2000);
				zbr.navigate().forward();
				Thread.sleep(2000);
				zbr.navigate().refresh();
				Thread.sleep(2000);
			}

}
