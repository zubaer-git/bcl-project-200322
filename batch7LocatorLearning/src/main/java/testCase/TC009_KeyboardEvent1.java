package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC009_KeyboardEvent1 extends DriverSetup{

	
	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test
	public static void KeyboardEventCheck() throws InterruptedException {

		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.xpath("//input[@id='q']"));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
     	//driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
		
	}
}
