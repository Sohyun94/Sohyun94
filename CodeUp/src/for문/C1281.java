package for문;

import java.util.Scanner;

public class C1281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if (a % 2 == 0) {
			ans -= a;
			System.out.print("-" + a);
		} else {
			ans += a;
			System.out.print(a);
		}
		for (int i = a + 1; i <= b; i++) {
			if (i % 2 == 0) {
				ans -= i;
				System.out.print("-" + i);
			} else {
				ans += i;
				System.out.print("+" + i);
			}
		}
		System.out.print("=" + ans);
	}

}
