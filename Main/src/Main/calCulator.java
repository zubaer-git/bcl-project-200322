package Main;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class calCulator {

	public static void main(String[] args) {
		
//		int x, y; //xy is variable
		System.out.println("Plz enter the value of x and y:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // for input
		int y = sc.nextInt();
		sc.close();
		
		int r1 = add(x,y);
		int r2 = subc(x,y);
		int r3 = mul(x,y);
		int r4 = div(x,y);
		
		
		System.out.println("value is=" + r1);
		System.out.println("value is=" + r2);
		System.out.println("value is=" + r3);
		System.out.println("value is=" + r4);
		

	}

	static int add(int p, int q) {  //pq is parameter
		int sum = p + q;
		return sum;
	}

	static int subc(int x1, int y1) {
		int sub = x1 - y1;
		return sub;
	}

	static int mul(int x2, int y2) {
		int mul = x2 * y2;
		return mul;
	}

	static int div(int x3, int y3) {
		int div = x3 / y3;
		return div;
	}
}
