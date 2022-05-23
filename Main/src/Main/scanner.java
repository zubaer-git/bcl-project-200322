package Main;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter ur value:");
		int x = sc.nextInt();
		int y = sc.nextInt();
//		System.out.println("x=" + x);
		sc.close();
		
		int add=adD(x,y);
		 System.out.println("This value is:" + add);
	}

	public static int adD(int x, int y) {
	int	sum = x+y;
	return sum;
	}
}