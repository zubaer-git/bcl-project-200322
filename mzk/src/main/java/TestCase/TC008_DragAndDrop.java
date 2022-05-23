package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC008_DragAndDrop extends DriverSetup {

	public static String basrUrl = "https://jqueryui.com/slider/";

	@Test

	public static void dragAnddrop() throws InterruptedException {
		driver.get(basrUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(ele2, 500, 0).build().perform();
		Thread.sleep(3000);
		a.dragAndDropBy(ele2, -300, 0).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		

		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//body/div[@id='slider-vertical']/span[1]"));
		a.dragAndDropBy(ele1, 0, 90).build().perform();
		Thread.sleep(3000);
		a.dragAndDropBy(ele1, 0, -40).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

	}

}
