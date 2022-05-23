package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_01_locatorLearning extends DriverSetup {
	public static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public static void lola() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.findElement(By.id("inputUsername")).sendKeys("araf");
		zbr.findElement(By.name("inputPassword")).sendKeys("asdf");
		zbr.findElement(By.className("signInBtn")).click();
		// zbr.findElement(By.xpath("//button[@className='signInBtn']")).click();
		// zbr.findElement(By.xpath("//button[contains@className,'signInBtn']")).click();
		// zbr.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		// zbr.findElement(By.cssSelector("button[className='signBtn']")).click();
		Thread.sleep(2000);

		System.out.println(zbr.findElement(By.cssSelector("p.error")).getText());

		zbr.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		zbr.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Araf");
		Thread.sleep(1000);
		zbr.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("asdf@gmail.com");
		Thread.sleep(1000);
		zbr.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("00001111222");
		Thread.sleep(1000);
		//zbr.findElement(By.cssSelector(".reset-pwd-btn")).click();
		zbr.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);

		String password=getPassword(zbr);
	//=========================================	
	//	System.out.println(password);
	    zbr.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//		zbr.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		zbr.findElement(By.id("inputUsername")).sendKeys("Araf");
		Thread.sleep(2000);

		zbr.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		
		zbr.findElement(By.id("chkboxOne")).click();
		Thread.sleep(1000);
		
		zbr.findElement(By.cssSelector("button[class='signInBtn']")).click();
		Thread.sleep(2000);
		
	}

	public static String getPassword(WebDriver zbr) throws InterruptedException {
		// TODO Auto-generated method stub
		zbr.get(baseUrl);
		zbr.findElement(By.linkText("Forgot your password?")).click();
		//zbr.manage().window().maximize();
		Thread.sleep(2000);
		zbr.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		String passwdText = zbr.findElement(By.cssSelector("form p")).getText();

		String[] Arry = passwdText.split("'");
		String password = Arry[1].split("'")[0];

		return password;
	}

}
