package greedy;

import java.util.Scanner;

public class B5585_거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 1000 - sc.nextInt();
		int[] charge = {500, 100, 50, 10, 5, 1};
		int ans = 0;
		for(int i = 0; i < 6; i++) {
			if(money >= charge[i]) {
				ans += money / charge[i];
				money = money % charge[i];
			}
		}
		System.out.println(ans);

	}

}
