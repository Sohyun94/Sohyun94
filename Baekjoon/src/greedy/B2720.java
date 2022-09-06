package greedy;

import java.util.Scanner;

public class B2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int a = money / 25;
			if((money % (25 * a)) > b) {
			int b = (money % (25 * a)) / 10;
			int c = money % (25 * a) % (10 * b) / 5;
			int d = money % (25 * a) % (10 * b) % (5 * c) / 1;
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
}
