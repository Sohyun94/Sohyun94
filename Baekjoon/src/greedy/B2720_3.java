package greedy;

import java.util.Scanner;

public class B2720_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int a = money / 25;
			money = money % 25;
			int b = money / 10;
			money = money % 10;
			int c = money / 5;
			money = money % 5;
			int d = money / 1;
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
}
