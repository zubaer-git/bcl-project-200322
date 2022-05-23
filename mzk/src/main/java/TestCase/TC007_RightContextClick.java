package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC007_RightContextClick extends DriverSetup {
	
	public static String baseUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	@Test
	
	public static void Rightclick() throws InterruptedException 
	
	{
		driver.get(baseUrl);;
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement ele =driver.findElement(By.xpath("//body/form[1]/input[1]"));
		Actions a= new Actions (driver);
		a.contextClick(ele).build().perform();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
	}

}
