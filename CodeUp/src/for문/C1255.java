package for문;

import java.util.Scanner;

public class C1255 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a <= b)
			for (double i = a; i <= b; i += 0.01) {
				System.out.printf("%.2f ", i);
			}
		else
			for (double i = b; i <= a; i += 0.01) {
				System.out.printf("%.2f ", i);
			}
	}

}
