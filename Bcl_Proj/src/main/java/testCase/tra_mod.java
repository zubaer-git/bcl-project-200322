package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.DriverSetup;

public class tra_mod extends DriverSetup {
	static int count = 1;

	@Test(invocationCount = 3)
	public static void trans_test() throws InterruptedException {

		String baseUrl = "http://192.168.104.6:7777/CBSTEST/f?p=222";
		bcl.get(baseUrl);
		// bcl.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		bcl.manage().window().maximize();
		Thread.sleep(1000);

		// String val = bcl.findElement(By.id("P101_USER_ID")).getAttribute("value");

		if (count == 1) {
			bcl.findElement(By.id("P101_USER_ID")).sendKeys("ASHRAF");
			count += 1; // count=count+1
		}

		// bcl.findElement(By.id("P101_USER_ID")).sendKeys("ASHRAF");

		// WebElement e = bcl.findElement(By.className("a-Icon
		// icon-menu-split-drop-down"));
		// Select s = new Select(e);
		// Actions a = new Actions(bcl);

		bcl.findElement(By.name("P101_PASSWORD")).sendKeys("ash123");
		Thread.sleep(1000);
		bcl.findElement(By.cssSelector("#P101_LOGIN")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//h3[contains(text(),'Bexi CBS')]")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//a[@id='t_MenuNav_1_0i']")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P7002_ACC_NO']")).sendKeys("4316101000014");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P7002_ACC_NO']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		bcl.findElement(By.xpath("//input[@id='P7002_TRAN_CODE']")).sendKeys("101");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P7002_TRAN_TYPE']")).sendKeys("c");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P7002_TRAN_AMT']")).sendKeys("5000");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='B32561966605717529']")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='P7001_CONFIRM_YES']")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//p[@id='error_msg_button']")).click();
		Thread.sleep(1000);
	}

}
