package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC008_DragAndDrop extends DriverSetup {

	public static String baseUrl = "https://jqueryui.com/slider/";

	@Test
	public static void sliderCheck() throws InterruptedException {

		driver.get(baseUrl);
		// new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// slider
		// Horizontal Slider

		driver.switchTo().frame(0);

		WebElement e = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		
		Actions a = new Actions(driver);

		a.dragAndDropBy(e, 500, 0).build().perform();
		Thread.sleep(3000);

		a.dragAndDropBy(e, -400, 0).build().perform();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();

		// Vertical Slider
		// driver.switchTo().frame(0);
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement e1 = driver.findElement(By.xpath("//body/div[@id='slider-vertical']/span[1]"));

		// a.dragAndDropBy(e1, 0, 100).build().perform();
		Thread.sleep(3000);

		a.dragAndDropBy(e1, 0, 100).build().perform();
		Thread.sleep(3000);
		a.dragAndDropBy(e1,0,-90).build().perform();
		Thread.sleep(3000);

		// CLose site
		driver.switchTo().defaultContent();
	}
}
