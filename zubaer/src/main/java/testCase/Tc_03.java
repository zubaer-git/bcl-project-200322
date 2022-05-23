package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_03 extends DriverSetup {
	public static String baseUrl="https://jqueryui.com/checkboxradio/";
	
	@Test
	public static void radiocheak() throws InterruptedException 
	{
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(3000);
		
		zbr.switchTo().frame(0);
		
		zbr.findElement(By.xpath("//body[1]/div[1]/fieldset[1]/label[1]")).click();
		Thread.sleep(3000);
		zbr.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[2]")).click();
		Thread.sleep(3000);
		
		zbr.switchTo().defaultContent();
		zbr.close();
		
	}
	
}
