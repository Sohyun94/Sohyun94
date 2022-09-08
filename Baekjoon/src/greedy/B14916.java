package greedy;

import java.util.Scanner;

public class B14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		if (n == 1 || n == 3)
			System.out.println(-1);
		else {
			while (n >= 1) {
				if (n % 2 != 0 || n % 5 == 0) {
					n -= 5;
					cnt++;
				} else {
					n -= 2;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
