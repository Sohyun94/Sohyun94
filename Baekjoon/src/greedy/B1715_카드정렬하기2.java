package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1715_카드정렬하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[N + 1];
		card[N] = 0;
		int[] mix = new int[N];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		if (N <= 3) {
			mix[0] = card[0] + card[1];
			mix[1] = card[2];
			int sum = 0;
			for (int i = 0; i < N-1; i++) {
				sum += mix[i];
			}
		} else {
			mix[0] = card[0] + card[1];
			mix[1] = card[2] + card[3];
			for (int i = 2; i < N; i++) {
				mix[N] = card[2 * N - 2] + card[2 * N - 1];
			}
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += mix[i];
			}
			System.out.println(sum);
		}

	}
}
