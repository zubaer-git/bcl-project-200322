package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_10_alertPopUp extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

	@Test
	public static void popup() throws InterruptedException {
		zbr.get(baseUrl);
		// zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame("iframeResult");

		WebElement ele = zbr.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		ele.click();
		Thread.sleep(5000);
		 
		zbr.switchTo().alert().dismiss();
		Thread.sleep(5000);

	}

}
