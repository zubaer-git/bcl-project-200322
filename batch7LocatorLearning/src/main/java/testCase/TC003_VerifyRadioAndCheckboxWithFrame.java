package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC003_VerifyRadioAndCheckboxWithFrame extends DriverSetup {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		int i;
		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		for(i=1; i<=3; i++) {
		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);
		// Operate Elements
		//driver.findElement(By.xpath("(//span[contains(@class,'checkboxradio')])[5]")).click();
		driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]")).click();
		//body[1]/div[1]/fieldset[2]/label[4]/span[1]
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[2]/span[1]")).click();
		Thread.sleep(5000);
		// Back to page
		driver.switchTo().defaultContent();
		}
		// Close site
		driver.close();
	}
}
