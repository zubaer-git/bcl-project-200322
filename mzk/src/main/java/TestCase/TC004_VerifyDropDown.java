package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC004_VerifyDropDown extends DriverSetup {
	public static String basrUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(priority = 1)
	public static void dropdown() throws InterruptedException {
		driver.get(basrUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement ele = driver.findElement(By.name("cars"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}

	@Test(priority = 2)
	public static void multi() throws InterruptedException {
		driver.get(basrUrl);
//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement ele = driver.findElement(By.name("cars"));
		Select s = new Select(ele);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(0)).click(s.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
Thread.sleep(2000);
		driver.switchTo().defaultContent();

	}
}