package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC009_KeyboardEvent extends DriverSetup {
	public static String base = "https://www.daraz.com.bd/";

	@Test
	public static void keyboardE() throws InterruptedException {
		driver.get(base);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("//input[@id='q']"));
		//Actions a = new Actions(driver);
		e.sendKeys(Keys.chord(Keys.SHIFT, "zubaer"));
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
