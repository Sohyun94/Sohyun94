package greedy;

import java.util.Scanner;

public class B1789_수들의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long cnt = 0;
		long sum = 0;
		for (int i = 1; i < S; i++) {
			if (sum >= S)
				break;
			sum += i;
			cnt++;
		}
		if (S == 1 || S == 2)
			System.out.println(1);
		else if (sum == S)
			System.out.println(cnt);
		else
			System.out.println(cnt - 1);
	}

}
