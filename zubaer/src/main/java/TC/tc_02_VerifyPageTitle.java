package TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_02_VerifyPageTitle extends DriverSetup {
	public static String baseUrl = "https://www.daraz.com.bd/";

	@Test(priority = 1)
	public static void title() {
		zbr.get(baseUrl);
		// zbr.manage().window().maximize();

		String TitleBar = zbr.getTitle();
		System.out.println("The Title Bar: " + TitleBar);

		Assert.assertEquals("Online Shopping in Bangladesh: Order Now from Daraz.com.bd", TitleBar);

	}

//--------------------------------------------------------

	@Test(priority = 2)
	public static void iswebsitesecured() throws InterruptedException {
		String y = zbr.getCurrentUrl();
		if (y.contains("https")) {
			System.out.println("site is secured");
		} else {
			System.out.println("site is insecured");
		}
		Thread.sleep(2000);
	}

}
