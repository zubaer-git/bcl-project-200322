package testCase;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_07 extends DriverSetup {
	public static String basrUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 18)
	public static void doubleclickRightclick() throws InterruptedException {

		zbr.get(basrUrl);
		zbr.manage().window().maximize();
		Thread.sleep(3000);

		zbr.switchTo().frame("iframeResult");

		Actions a = new Actions(zbr);

		WebElement ele = zbr.findElement(By.xpath("//body[1]/form[1]/select[1]/option[3]"));
		a.doubleClick(ele).build().perform();
		Thread.sleep(3000);

		WebElement ele1 = zbr.findElement(By.xpath("//body//h1"));
		a.contextClick(ele1).build().perform();
		Thread.sleep(3000);

		zbr.switchTo().defaultContent();
	}

}
