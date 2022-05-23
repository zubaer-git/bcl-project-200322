package TC;

import org.testng.annotations.Test;

import driver.DriverSetup;

public class tc_05_Refresh extends DriverSetup{
	public static String baseUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
@Test

public static void refresh() throws InterruptedException 
{
zbr.get(baseUrl);
//zbr.manage().window().maximize();
Thread.sleep(2000);

//zbr.navigate().to("www.google.com");
zbr.navigate().to("http://www.google.com");
Thread.sleep(2000);
zbr.navigate().back();
Thread.sleep(2000);
zbr.navigate().forward();
Thread.sleep(2000);
zbr.navigate().refresh();
Thread.sleep(2000);

}
}
