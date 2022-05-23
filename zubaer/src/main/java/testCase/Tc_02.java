package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverSetup;

public class Tc_02 extends DriverSetup {
	public static String baseUrl="https://www.daraz.com.bd/";
	
	@Test(priority=1)

	public static void verifyTitle()
	{
	zbr.get(baseUrl);
	zbr.manage().window().maximize();
	
	String actualTitleofthesite=zbr.getTitle();
	System.out.println("The title of the site: "+actualTitleofthesite);
	Assert.assertEquals("Online Shopping in Bangladesh: Order Now from Daraz.com.bd", actualTitleofthesite);

}
	//.................................................
	
	@Test(priority=2)
	
	public static void websitesecure()
	{
	String y=zbr.getCurrentUrl();
	
		if(y.contains("https"))
		{
			System.out.println("Site is secured");
		
		}else 
		{
			System.out.println("Site is not secured");
		}
			
				
	}
	

	
	
}
