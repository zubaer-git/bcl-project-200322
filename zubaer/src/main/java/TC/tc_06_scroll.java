package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.DriverSetup;
import net.bytebuddy.asm.Advice.Argument;

public class tc_06_scroll extends DriverSetup {
	public static String baseUrl = "https://www.selenium.dev/";
	// public static String
	// baseUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void scroll() throws InterruptedException {

		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) zbr;


		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);

		WebElement e = zbr.findElement(By.xpath("//body/div[1]/main[1]/div[4]/div[5]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView()", e);

		Thread.sleep(2000);
	}

}
