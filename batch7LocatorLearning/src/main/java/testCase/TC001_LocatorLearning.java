package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.DriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_LocatorLearning extends DriverSetup{
	String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void  locatorLearning() throws InterruptedException 
	{
		driver.get(baseUrl);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("mohoshi");;
		Thread.sleep(2000);
		
		driver.findElement(By.name("inputPassword")).sendKeys("passwordField");
		Thread.sleep(2000);
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());;
		//Formula:    tagname.value (if class is given)
		//			  tagname#value (if id is given)
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("papel");
		//         //tagname[@attribute='value'] & //tagname[contains(@attribute,'value')]
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("papel@gmail.com");
		//			tagname[attribute='value']
		
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01670102216");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01670102216");
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
	}
}
