package testCase;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class AngularProject extends DriverSetup{

	public static String baseUrl="https://angularjs.org";
	//String baseUrl="https://angular.io";
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void  locatorLearning() throws InterruptedException 
	{
	driver.get(baseUrl);
	//driver.manage().window().maximize();
	Thread.sleep(2000);
		
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter to fill text box");
	String x=sc.nextLine(); //for input
	System.out.println("x=" +x);
	
	
	//driver.manage().window().maximize();
	//driver.get(baseUrl);
	//wait for page ready
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
	
	//Scroll to view and fill text box with data
	WebElement e=driver.findElement(By.xpath("//span[@plnkr='hello.html']/ancestor::*[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("arguments[0].scrollIntoView();",e);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
	//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1[contains(text(),'Hello')]"), "Hello "+x+"!"));
	Thread.sleep(2000);
	//Close Site
	driver.close();

}
}
