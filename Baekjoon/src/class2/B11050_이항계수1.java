package class2;

import java.util.Scanner;

public class B11050_이항계수1 {
	// 이항계수 -> 그냥 nCk 구하면 된다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 1;
		int D = 1;
		for (int i = N; i >= N - K + 1; i--) {
			ans = ans * i;
		}
		for (int i = K; i > 1; i--) {
			D = D * i;
		}
		ans = ans / D;
		System.out.println(ans);
	}

}
