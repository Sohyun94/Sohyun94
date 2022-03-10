package for문;

import java.util.Scanner;

public class C1280 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				ans -= i;
				System.out.print("-" + i);
			} else {
				ans += i;
				System.out.print("+" + i);
			}
		}
		System.out.println("=" + ans);
	}

}
