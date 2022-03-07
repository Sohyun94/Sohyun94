package if_else;

import java.util.Scanner;

public class C1224 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double A = (double) a / b;
		double C = (double) c / d;
		if (A > C)
			System.out.println(">");
		else if (A == C)
			System.out.println("=");
		else
			System.out.println("<");
	}

}
