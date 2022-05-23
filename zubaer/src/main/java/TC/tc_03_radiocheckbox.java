package TC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import driver.DriverSetup;

public class tc_03_radiocheckbox extends DriverSetup {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test

	public static void radiocheckbox() throws InterruptedException {
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);

		zbr.switchTo().frame(0);

		zbr.findElement(By.xpath("//body[1]/div[1]/fieldset[1]/label[2]/span[2]")).click();
		zbr.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[2]")).click();
		zbr.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]")).click();
		
	Thread.sleep(2000);
		zbr.switchTo().defaultContent();

	}

}
