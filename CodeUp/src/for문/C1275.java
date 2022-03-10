package for문;

import java.util.Scanner;

public class C1275 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 1;
		for (int i = 0; i < k; i++) {
			a = a * n;
		}
		System.out.println(a);
	}

}
