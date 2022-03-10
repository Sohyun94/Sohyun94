package for문;

import java.util.Scanner;

public class C1276 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		for (int i = 0; i < n; i++) {
			a = a * (n - i);
		}
		System.out.println(a);
	}

}
