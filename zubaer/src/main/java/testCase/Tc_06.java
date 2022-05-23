package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_06 extends DriverSetup{
	public static String baseUrl="https://www.daraz.com.bd/";
	
	@Test
	public static void Scroll() throws InterruptedException 
	{
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(3000);
		
		//javascriftExecuter js = (javascriftExecuter) zbr;.
		JavascriptExecutor js = (JavascriptExecutor) zbr;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		WebElement e=zbr.findElement(By.cssSelector(".fs-card-img"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		//WebElement e1=zbr.findElement(By.cssSelector(".image")); Note ARGUMENT DECLEAR
		//js.executeScript("argument[0].scrollIntoView();" , e1);
	
		Thread.sleep(5000);
	
	}
	
			
			
}
