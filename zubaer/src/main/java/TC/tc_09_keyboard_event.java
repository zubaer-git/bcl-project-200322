package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_09_keyboard_event extends DriverSetup {
	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test

	public static void keyboard() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = zbr.findElement(By.xpath("//input[@id='q']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.SHIFT, "zbr"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.SHIFT, "asd"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
