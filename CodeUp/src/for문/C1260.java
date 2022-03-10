package for문;

import java.util.Scanner;

public class C1260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		if (a % 3 == 0) {
			for (int i = a; i <= b; i += 3) {
				sum += i;
			}
		} else if (a % 3 == 1) {
			for (int i = a + 2; i <= b; i += 3) {
				sum += i;
			}
		} else if (a % 3 == 2) {
			for (int i = a + 1; i <= b; i += 3) {
				sum += i;
			}
		}
		System.out.println(sum);
	}// main

}
