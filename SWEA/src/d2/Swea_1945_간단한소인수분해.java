package d2;

import java.util.Scanner;

public class Swea_1945_간단한소인수분해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			// 무한 반복
			while (true) {
				if (num % 2 == 0) {
					num /= 2;
					a++;
				} else if (num % 3 == 0) {
					num /= 3;
					b++;
				} else if (num % 5 == 0) {
					num /= 5;
					c++;
				} else if (num % 7 == 0) {
					num /= 7;
					d++;
				} else if (num % 11 == 0) {
					num /= 11;
					e++;
				}
				if (num == 1)
					break;
			}
			System.out.println("#" + tc + " " + a + " " + b + " " + c + " " + d + " " + e);
		} // tc

	} // main

}
