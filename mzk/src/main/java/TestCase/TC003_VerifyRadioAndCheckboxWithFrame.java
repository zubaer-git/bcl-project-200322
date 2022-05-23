package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC003_VerifyRadioAndCheckboxWithFrame extends DriverSetup {

	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test

	public static void radio_checkbox() throws InterruptedException {
		driver.get(baseUrl);
//driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[3]/span[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

	}
}
