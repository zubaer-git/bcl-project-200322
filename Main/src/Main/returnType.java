package Main;

import java.util.Scanner;

public class returnType {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz input your Value:");
		x = sc.nextInt();
		y = sc.nextInt();
		evenOdd(12);
//		int addition = sum(35, 15);
		int addition = sum(x, y);
		System.out.println("this result is:" + addition);
	}

	public static int sum(int x, int y) { // int for return
		int sum = x + y;
		return sum;
	}

	public static void evenOdd(int x) { // for not return
		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
