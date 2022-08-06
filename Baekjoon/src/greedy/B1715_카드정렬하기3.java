package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1715_카드정렬하기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[N + 1];
		int[] mix = new int[N / 2];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		if (N % 2 == 0) {
			for (int i = 0; i < N / 2; i++) {
				mix[i] = card[2 * i] + card[2 * i + 1];
			}
		} else {
			card[N] = 0;
		}
		for (int i = 0; i < (N / 2); i++) {
			mix[i] = card[2 * i] + card[2 * i + 1];
		}
		int sum = 0;
		for (int i = 0; i < (N / 2); i++) {
			sum += mix[i];
		}
		System.out.println(sum);
	}
}
