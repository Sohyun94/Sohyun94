package greedy;

import java.util.Scanner;

public class B2720_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int a, b, c, d, aCharge, bCharge, cCharge;
			a = b = c = d = aCharge = bCharge = cCharge = 0;
			if (money >= 25) {
				a = money / 25;
				aCharge = money % (25 * a);
				if (aCharge >= 10 && aCharge < 24) {
					b = aCharge / 10;
					bCharge = aCharge % (10 * b);
					if (bCharge >= 5 && bCharge < 10) {
						c = bCharge / 5;
						cCharge = bCharge % (5 * c);
						if (cCharge >= 1 && cCharge < 5)
							d = cCharge / 1;
					} else if (1 <= bCharge && bCharge < 5) {
						d = bCharge / 1;
					}
				} else if (aCharge < 10 && aCharge >= 5) {
					c = aCharge / 5;
					cCharge = aCharge % (5 * c);
					if (cCharge >= 1 && cCharge < 5)
						d = cCharge / 1;
				} else if (aCharge >= 1 && aCharge < 5) {
					d = aCharge / 1;
				}
			} else if (money >= 10 && money < 25) {
				b = money / 10;
				bCharge = money % (10 * b);
				if (bCharge >= 5 && bCharge < 10) {
					c = bCharge / 5;
					cCharge = bCharge % (5 * c);
					if (cCharge >= 1 && cCharge < 5) {
						d = cCharge / 1;
					}
				} else if (bCharge < 5 && bCharge >= 1)
					d = bCharge / 1;

			} else if (money < 10 && money >= 5) {
				c = money / 5;
				cCharge = money / (5 * c);
				if (cCharge >= 1 && cCharge < 5) {
					d = cCharge / 1;
				}
			} else if (money < 5 && money >= 1)
				d = money / 1;
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
}
