package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC0010_AlertAndPopUp extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

	@Test
	public static void alertHandlingCheck() throws InterruptedException {
		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement f = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(f);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		//OR===========================================
		//zbr.switchTo().frame("iframeResult");

		//WebElement ele = zbr.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		//ele.click();
		//Thread.sleep(5000);
		 
		//zbr.switchTo().alert().dismiss();
		//Thread.sleep(5000);
	}
}
                