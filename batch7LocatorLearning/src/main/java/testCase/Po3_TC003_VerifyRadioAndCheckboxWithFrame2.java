package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.Po3_CheckboxRadio;
import base.DriverSetup;

public class Po3_TC003_VerifyRadioAndCheckboxWithFrame2 extends DriverSetup {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		
		driver.get(baseUrl);
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);
		
		Po3_CheckboxRadio var= new Po3_CheckboxRadio(driver);
		var.radioandcheck1();
		Thread.sleep(2000);
		var.radioandcheck2();
		Thread.sleep(2000);
		var.radioandcheck3();
		Thread.sleep(2000);
		var.radioandcheck4();
		Thread.sleep(5000);
		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}

	
}
