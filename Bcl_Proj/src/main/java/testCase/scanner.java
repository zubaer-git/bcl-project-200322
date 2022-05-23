package testCase;

import java.util.Scanner;

import base.DriverSetup;

public class scanner extends DriverSetup{
	public static void scaner() {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	System.out.println("Enter the volume of x: " + s);
	
	sc.close();
	}
}
