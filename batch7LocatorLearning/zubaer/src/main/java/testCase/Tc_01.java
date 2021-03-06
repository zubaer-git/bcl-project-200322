package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_01 extends DriverSetup {
	static String baseUrl="https://rahulshettyacademy.com/locatorspractice/#";
	

	@Test
	public void lola() throws InterruptedException 
	{
		zbr.get(baseUrl);
		zbr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		zbr.manage().window().maximize();
		Thread.sleep(2000);
		
		zbr.findElement(By.id("inputUsername")).sendKeys("araf");
		Thread.sleep(2000);
		
		zbr.findElement(By.name("inputPassword")).sendKeys("asd");
		Thread.sleep(2000);
		
		zbr.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		
		System.out.println(zbr.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(2000);
		
		zbr.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		zbr.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("asd");
		Thread.sleep(1000);
		//01.zbr.findElement(By.xpath("//input[@placeholder='Email']").sendkeys("bcl@gmail.com");
		zbr.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("asd@gmail.com");
		Thread.sleep(1000);
		zbr.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("0175566546");
		Thread.sleep(1000);
		
		//02.zbr.findElement(By.className("reset-pwd-btn")).click();
		zbr.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		
		String password=getPassword(zbr);
			
		zbr.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		zbr.findElement(By.id("inputUsername")).sendKeys("araf");
		zbr.findElement(By.name("inputPassword")).sendKeys(password);
		zbr.findElement(By.id("chkboxOne")).click();
		
	
		zbr.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//zbr.findElement(By.xpath("//button[@class='submit')]")).click();
		Thread.sleep(2000);
		}

        
	
	public static String getPassword(WebDriver zbr) throws InterruptedException
	{
		zbr.get(baseUrl);
		zbr.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		zbr.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String passwordText=zbr.findElement(By.className("infoMsg")).getText();
	     //System.out.println(passwordText);
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] passwordArray=passwordText.split("'");
		//String [] passwordArray2=passwordArray[1].split("'");
		//String password=passwordArray2[0];
		
		//String password=passwordArray[1].split("'")[0];
		String password=passwordArray[1];
		
		return password;
		
	}

	} 

	
	
