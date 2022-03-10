package for문;

import java.util.Scanner;

public class C1272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int h = sc.nextInt();
		int k_money = 0;
		int h_money = 0;
		if (k % 2 == 0) {
			k_money = k * 5;
		} else
			k_money = (k + 1) / 2;
		if (h % 2 == 0) {
			h_money = h * 5;
		} else
			h_money = (h + 1) / 2;
		System.out.println(k_money + h_money);
	}

}
