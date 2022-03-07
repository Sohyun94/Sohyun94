package if_else;

import java.util.Scanner;

public class C1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 1;
		if (a % b == 0) {
			x = a / b;
			System.out.println(b + "*" + x + "=" + a);
		} else if (b % a == 0) {
			x = b / a;
			System.out.println(a + "*" + x + "=" + b);
		} else {
			System.out.println("none");
		}

	}

}
