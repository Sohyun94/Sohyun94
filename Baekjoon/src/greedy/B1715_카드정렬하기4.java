package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1715_카드정렬하기4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] card = new long[N];
		long[] mix = new long[N];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextLong();
		}
		Arrays.sort(card);
		if (N == 1) {
			System.out.println(card[0]);
		} else {
			mix[0] = card[0];
			for (int i = 1; i < N; i++) {
				mix[i] = mix[i - 1] + card[i];
			}
			long sum = 0;
			for (int i = 1; i < N; i++) {
				sum += mix[i];
			}
			System.out.println(sum);
		}
	}
}
