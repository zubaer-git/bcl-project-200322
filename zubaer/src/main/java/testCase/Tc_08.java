package testCase;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_08 extends DriverSetup {
	public static String basrUrl = "https://jqueryui.com/slider/";

	@Test

	public static void sliderCheck() throws InterruptedException {
			
		zbr.get(basrUrl);
		zbr.manage().window().maximize();
		Thread.sleep(3000);

		zbr.switchTo().frame(0);
		
		WebElement ele = zbr.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		Actions a = new Actions(zbr);
		a.dragAndDropBy(ele, 300, 0).build().perform();
		Thread.sleep(2000);

		a.dragAndDropBy(ele, -200, 0);
		Thread.sleep(3000);

		zbr.switchTo().defaultContent();
//Vertical

		zbr.findElement(By.linkText("Vertical slider")).click();
		WebElement ele1 = zbr.findElement(By.xpath("//body/div[@id='slider-vertical']/span[1]"));
		a.dragAndDropBy(ele1, 0, 100).build().perform();
		a.dragAndDropBy(ele1, -200, 0).build().perform();
		Thread.sleep(3000);
		zbr.switchTo().defaultContent();
	}

}
