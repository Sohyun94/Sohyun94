package for문;

import java.util.Scanner;

public class C1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 5 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

}
