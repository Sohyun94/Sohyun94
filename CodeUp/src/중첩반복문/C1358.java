package 중첩반복문;

import java.util.Scanner;

public class C1358 {
	// 풀이 참고
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j < n / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
