package Basic100;

import java.util.Scanner;

public class C1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = (double) a;
		System.out.println((long)(a+b));
		System.out.println((long)(a-b));
		System.out.println((long)(a*b));
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f", c/b);
	}
}
