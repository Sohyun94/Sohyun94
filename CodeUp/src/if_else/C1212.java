package if_else;

import java.util.Scanner;

public class C1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (b < a && c < a) {
			if (b + c > a) {
				System.out.println("yes");
			} else
				System.out.println("no");
		} else if (a < b && c < b) {
			if (a + c > b) {
				System.out.println("yes");
			} else
				System.out.println("no");
		} else {
			if (a + b > c) {
				System.out.println("yes");
			} else
				System.out.println("no");
		}

	}

}
