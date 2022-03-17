package 중첩반복문;

import java.util.Scanner;

public class C1370 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//풀이 참고
		int h = sc.nextInt(); // 높이
		int r = sc.nextInt(); // 반복 횟수
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for (int j = h - 2; j >= 0; j--) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}

	}

}
