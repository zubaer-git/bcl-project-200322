package TC;

import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_04_sele_mult_sel extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 1)

	public static void mulsel() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame("iframeResult");
		WebElement ele = zbr.findElement(By.name("cars"));
		Select car = new Select(ele);
		car.selectByIndex(0);
		Thread.sleep(2000);
		car.deselectByIndex(0);
		Thread.sleep(2000);
		car.selectByVisibleText("Audi");
		Thread.sleep(2000);
		car.deselectAll();
		zbr.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	// ======================================================

	@Test(priority = 2)

	public static void multselec() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);
		zbr.switchTo().frame("iframeResult");
		WebElement ele = zbr.findElement(By.name("cars"));
//		WebElement ele = zbr.findElement(By.name("cars"));
		Select car = new Select(ele);
		Actions a = new Actions(zbr);
		a.keyDown(Keys.CONTROL).click(car.getOptions().get(1)).click(car.getOptions().get(3)).build().notify();
		Thread.sleep(2000);
zbr.switchTo().defaultContent();
	}
}
