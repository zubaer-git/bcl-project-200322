package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_08_dragdrop extends DriverSetup{
	public static String baseUrl = "https://jqueryui.com/slider/";
	@Test
	public static void dragdrop() throws InterruptedException
	{
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread .sleep(2000);
		
		zbr.switchTo().frame(0);
		
		WebElement ele=zbr.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		//WebElement e = driver.findElement(By.id("slider"));
		Actions a = new Actions (zbr);
		a.dragAndDropBy(ele, 500, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(ele, -400, 0).build().perform();
		Thread.sleep(2000);
		
		zbr.switchTo().defaultContent();
		
		WebElement ele1 = zbr.findElement(By.xpath("//a[contains(text(),'Vertical slider')]"));
		
		zbr.switchTo().frame(0);
	//	WebElement ele1 = zbr.findElement(By.xpath("//body/div[@id='slider-vertical']/span[1]"));
		a.dragAndDropBy(ele1, 0, 100).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(ele1, 0, -90).build().perform();
		Thread.sleep(2000);
		
		zbr.switchTo().defaultContent();
		
	}

}
