package class2;

import java.util.Scanner;

public class Boj2231_분해합_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < N; i++) {
			int dN = i; // 점점 커지면서 계산
			int sum = 0;

			while (dN != 0) {
				sum += dN % 10; // 나머지를 10으로 다시 나누면 자릿수대로 들어감
				dN /= 10;
			}

			if (sum + i == N) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
