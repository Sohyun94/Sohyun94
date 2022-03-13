package 중첩반복문;

import java.util.Scanner;

public class C1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (1 <= i && i < n - 1) {
					if (1 <= j && j < n - 1) {
						System.out.print(" ");
					} else
						System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
