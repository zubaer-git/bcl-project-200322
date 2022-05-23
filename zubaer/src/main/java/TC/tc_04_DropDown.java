package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_04_DropDown extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority=1)
	public static void dropdown() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame("iframeResult");

		WebElement ele = zbr.findElement(By.name("cars"));
		Select car = new Select(ele);

		car.selectByIndex(1);
		Thread.sleep(2000);
		car.deselectByIndex(1);
		Thread.sleep(2000);

		zbr.switchTo().defaultContent();
	}

//===================================================
	
	@Test(priority=2)
	
	public static void MulCarSel() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame("iframeResult");

		WebElement ele = zbr.findElement(By.name("cars"));
		Select car = new Select(ele);

		Actions a = new Actions(zbr);

		a.keyDown(Keys.CONTROL).click(car.getOptions().get(1)).click(car.getOptions().get(2)).build().perform();
		Thread.sleep(2000);
		zbr.switchTo().defaultContent();

	}
}
