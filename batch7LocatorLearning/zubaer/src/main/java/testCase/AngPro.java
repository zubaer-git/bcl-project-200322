package testCase;

import java.util.Scanner;

import org.testng.annotations.Test;

import driver.DriverSetup;

public class AngPro extends DriverSetup {
	
	//public class AngPro extends DriverSetup{

		String baseUrl="https://angularjs.org";
		//String baseUrl="https://angular.io";	
		
		//@SuppressWarnings("deprecation")
		@Test
		//public void  locatorLearning() throws InterruptedException 
		public void locatorLearning() throws InterruptedException 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to fill text box");
		String x=sc.nextLine();
		
		
		zbr.manage().window().maximize();
		zbr.get(baseUrl);
		}
}