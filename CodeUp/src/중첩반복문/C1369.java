package 중첩반복문;

import java.util.Scanner;

public class C1369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
					// 코드 참고..
				} else if (k == 1) {// 간격이 1일 때마다 별 찍기
					System.out.print("*");
				} else if ((i + j) % k == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}// main

}
