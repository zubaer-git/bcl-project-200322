package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Po3_CheckboxRadio {

	WebDriver driver = null;

	public Po3_CheckboxRadio(WebDriver driver) {
		this.driver = driver;
	}

	By check1 = By.xpath("//body/div[1]/fieldset[1]/label[3]");

	By check2 = By.xpath("//body/div[1]/fieldset[1]/label[1]");

	By check3 = By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");

	By check4 = By.xpath("//body[1]/div[1]/fieldset[2]/label[2]/span[1]");

	public void radioandcheck1() {
		driver.findElement(check1).click();
	}

	public void radioandcheck2() {
		driver.findElement(check2).click();
	}

	public void radioandcheck3() {
		driver.findElement(check3).click();
	}

	public void radioandcheck4() {
		driver.findElement(check4).click();
	}

}
