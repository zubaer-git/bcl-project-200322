package testCase;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_04 extends DriverSetup {
	private static final String SelectAvailablecars = null;
	public static String baseUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public static void dropDown() throws InterruptedException 
	{
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(3000);
		
		zbr.switchTo().frame("iframeresult");
		WebElement ele=zbr.findElement(By.name("car"));
		Select Availablecar=new Select(ele);
		Thread.sleep(3000);
		
		Availablecar.selectByIndex(1);
		Availablecar.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		
		zbr.switchTo().defaultContent();
		
		
	}
	
	@Test
	public static void Dropdown() throws InterruptedException 
	{
		zbr.get(baseUrl);
		zbr.manage().window().maximize();
		Thread.sleep(2000);
		
		zbr.switchTo().frame("iframeResult");
		
		WebElement ele=zbr.findElement(By.name("cars"));
		Select Availablecar =new Select(ele);
		Actions a = new Actions(zbr);
		a.keyDown(Keys.CONTROL).click(Availablecar.getOptions().get(0)).click(Availablecar.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		zbr.switchTo().defaultContent();
	}
	
}
