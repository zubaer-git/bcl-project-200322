package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC006_Scroll extends DriverSetup {
	private static final JavascriptExecutor JavascriptExecutor = null;
	public static String baseUrl = "https://www.selenium.dev/";

	@Test
	public static void scrol() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		JavascriptExecutor js = (JavascriptExecutor) driver;


		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);

		WebElement ele =driver.findElement(By.xpath("//body/div[1]/main[1]/div[7]/div[2]/div[1]/div[1]/a[1]"));
	//	js.executeScript(argument[0],scrlllview)
		js.executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(3000);
		
		

	}

}
