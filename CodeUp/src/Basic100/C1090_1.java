package Basic100;

import java.util.Scanner;

public class C1090_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		for(int i = 1; i < n; i++) {
			a *= r;
		}
		System.out.println(a);
	}

}
