package for문;

import java.util.Scanner;

public class C1282 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = 0;

		for (long t = n; t > 0; t--) {
			if (t * t < n) {
				k = n - t * t;
				System.out.println(k + " " + t);
				break;
			}
		}

	}

}
