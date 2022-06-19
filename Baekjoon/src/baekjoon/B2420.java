package baekjoon;

import java.util.Scanner;

public class B2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a >= b)
			System.out.printf("%.0f", a - b);
		else
			System.out.printf("%.0f", b - a);

	}

}
