package greedy;

import java.util.Scanner;

public class B13305_주유소3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] road = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			road[i] = sc.nextInt();
		}
		int[] city = new int[N];
		for (int i = 0; i < N; i++) {
			city[i] = sc.nextInt();
		}

		long cost = 0;
		// 주유 최솟값 구하고 최솟값 만날 때마다 갱신
		long min = city[0];
		for (int i = 0; i < N - 1; i++) {
			if (min > city[i]) {
				min = city[i];
			}
			cost += min * road[i];
		}
		System.out.println(cost);
	} // main
}
