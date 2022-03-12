package for문;

import java.util.Scanner;

public class C1283 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int day = sc.nextInt();
		double var[] = new double[day];
		double pro = 1;
		double profit = 0;
		for (int i = 0; i < day; i++) {
			var[i] = sc.nextInt();
		}
		for (int i = 0; i < day; i++) {
			pro = pro * (1 + (var[i] / 100));
		}
		profit = money * pro - money;
		if (profit > -0.5 && profit < money * 0.5) {
			System.out.printf("%.0f\n", profit);
			System.out.println("same");
		} else if (profit <= -0.5) {
			System.out.printf("%.0f\n", profit);
			System.out.println("bad");
		} else if (profit >= 0.5) {
			System.out.printf("%.0f\n", profit);
			System.out.println("good");
		} // mqin
	}
}
