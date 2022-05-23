package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC002_VerifyPageTitle extends DriverSetup {
	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test(priority = 1)
	public static void pageTitle() throws InterruptedException {
		driver.get(baseUrl);
//zbr.manage().window().maximize();
		Thread.sleep(2000);

		String title = driver.getTitle();
		System.out.println("the site of the title: " + title);
		Assert.assertEquals("Online Shopping in Bangladesh: Order Now from Daraz.com.bd", title);
	}

	// ======================================
	@Test(priority = 2)
	public static void siteSecu() throws InterruptedException {
		String y = driver.getCurrentUrl();
		if (y.contains("https")) {
			System.out.println("site is secured");
		} else
			System.out.println("site is insecured");
		Thread.sleep(2000);
	}
}
