package greedy;

import java.util.Scanner;

public class B13305_주요소 {

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
		
		int cost = city[0] * road[0];
		for (int i = 1; i <= N - 2; i++) {
			if (i == N - 2) {
				if (city[N - 3] > city[N - 2]) {
					cost += city[N - 2] * road[i];
				} else {
					cost += city[N - 3] * road[i];
				}
			} else {
				if (city[i] > city[i + 1]) {
					cost += city[i + 1] * road[i];
				} else {
					cost += city[i] * road[i];
				}
			}
		}
		System.out.println(cost);
	}

}
