package testCase;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class AngPro extends DriverSetup {
	
	//public class AngPro extends DriverSetup{

		public static String baseUrl="https://angularjs.org";
		//String baseUrl="https://angular.io";	
		
		@SuppressWarnings("deprecation")
		@Test
		//public void  locatorLearning() throws InterruptedException 
		public void locatorLearning() throws InterruptedException 
		{
			zbr.manage().window().maximize();
			zbr.get(baseUrl);
			Thread.sleep(2000);
			
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter to fill text box");
		String x=sc.nextLine();
		
		WebElement ele=zbr.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]"));
		JavascriptExecutor js =(JavascriptExecutor) zbr;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(2000);
		
		zbr.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1[contains(text(),'Hello')]"), "Hello "+x+"!"));
		Thread.sleep(2000);
		//Close Site
		zbr.close();

	}		
			
		}
