package Main;

public class divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisor(50);
	}

	static void divisor(int num) {
		int i;
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
