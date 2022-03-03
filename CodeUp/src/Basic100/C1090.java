package Basic100;

import java.util.Scanner;

public class C1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		double pw = Math.pow(r, n-1);
		double ans = a*pw;
		System.out.printf("%.0f", ans);
	}

}
