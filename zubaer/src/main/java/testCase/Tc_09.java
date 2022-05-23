package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_09 extends DriverSetup{
	public static String baseUrl="https://automationpractice.com/index.php";
	//public static String baseUrl="https://jqueryui.com/slider/";
	
	
	
	@Test
	public static void keyboard() throws InterruptedException 
	{
		zbr.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		zbr.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=zbr.findElement(By.linkText("Draggable"));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.ENTER));
		e.sendKeys(Keys.chord(Keys.SHIFT),"tedtalk");
		
		Thread.sleep(2000);
	}

}
