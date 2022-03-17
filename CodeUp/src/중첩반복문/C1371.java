package 중첩반복문;

import java.util.Scanner;

public class C1371 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = n; j < 2 * n; j++) {
				if (j == i + n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = n; i <= 2 * n; i++) {
			for (int j = 0; j < n; j++) {
				if (i - j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = n; j <= 2 * n; j++) {
				if (i + j == 3 * n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
