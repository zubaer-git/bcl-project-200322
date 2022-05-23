package TC;

import java.awt.Desktop.Action;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_07_Right_click extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void right$double() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame("iframeResult");

//bElement ele1= findElement(By.xpath("//body/form[1]/input[1]"));
		WebElement ele1 = zbr.findElement(By.xpath("//body/form[1]/input[1]"));
		Actions a = new Actions(zbr);
		a.contextClick(ele1).build().perform();  //for right click
		Thread.sleep(2000);

		WebElement ele2 = zbr.findElement(By.xpath("//option[contains(text(),'Saab')]"));

		a.doubleClick(ele2).build().perform();
		Thread.sleep(2000);

		zbr.switchTo().defaultContent();

		Thread.sleep(2000);

	}

}
