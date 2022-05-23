package Main;

public class ifelsefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();
		Char();
		Abc();
		Abc1();
		Abc2();
		Forlop();
		Forloop();
		Forloop1();
		Forloop2();
		Forloop3();
		While();
		Dowhile();
		Nloop();
		Nloop1();
	}

//		@Test(priority = 1)
	public static void evenOdd() {
		int num = 80;
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	// ===========================

	// @Test(priority = 2)
	public static void Char() {
		char ch = 'i';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { //or
			System.out.println("Vowel");
		} else {

			System.out.println("Consonent");

		}
	}

	// =================================

	// @Test(priority = 3)
	public static void Abc() {
		int x = 25;
		if (x % 2 == 0 && x % 5 == 0) { //and
			System.out.println("hi");
		} else {
			System.out.println("hellow");
		}

	}

	// ===================================

//		@Test(priority = 4)
	public static void Abc1() {
		int x = 9;
		if (x <= 5 && x > 10) {
			System.out.println("infant");
		} else if (x <= 12) {
			System.out.println("chaid");
		} else if (x <= 16) {
			System.out.println("adult");
		} else {
			System.out.println("old");
		}

	}

	// ===========================

//		@Test(priority = 5)
	public static void Abc2() {
		int x = 12;
		switch (x) {
		case 1:
			System.out.println("bd");
			break;
		case 2:
			System.out.println("usa");
			break;
		default:
			System.out.println("out of earth");
			break;
		}
	}

	// ==================================

//		@Test(priority = 6)
	public static void Forlop() {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) 
				continue;   //Continue (Loop continue)
		System.out.println(i);
			
			
		}

	}

	//Break	
	public static void Forloop() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 3)
				break; // break (loop break)
		
			
			
		}

	}

	// =============================

//		@Test(priority = 7)
	public static void Forloop1() {
		int j;
		for (j = 100; j >= 0; j = j - 10) {
			System.out.println(j);
		}

	}

	// ====================================
//		@Test(priority = 8)
	public static void Forloop2() {
		int k;
		int sum = 0;
		for (k = 30; k <= 120; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				sum = sum + k;
//					System.out.println("summation is: " + sum);
			}

		}
		System.out.println("summation is: " + sum);
	}

	// =========================
//		@Test(priority = 9)
	public static void Forloop3() {

		int sum1 = 0;
		int k = 30;
		while (k <= 120) {

			if (k % 3 == 0 && k % 5 == 0) {
				sum1 = sum1 + k;

				// System.out.println("summation1 is: " + sum1);
			}

			k = k + 1;
		}
		System.out.println("summation1 is: " + sum1);
	}

	// ====================================
//		@Test(priority = 10)
	public static void While() {
		int i = 5;
		int sum = 0;
		while (i <= 100) {
			// System.out.println("let me go!");
			sum = sum + i;
			i = i + 5;
		}
		System.out.println("sum is:" + sum);
	}
	// ====================================

//		@Test(priority = 11)
	public static void Dowhile() {
		int a = 1;
		do {
			System.out.println("let me go");
			a++;
		} while (a <= 5);
	}

	// ====================================

//		@Test(priority = 12)
	public static void Nloop1() {
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // New line
		}

	}
	// ====================================

//		@Test(priority = 13)
	public static void Nloop() {
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(); // New line
		}

	}

}
