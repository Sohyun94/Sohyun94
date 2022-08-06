package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1715_카드정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[N];
		int[] mix = new int[N + 1];
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		mix[0] = card[0];
		mix[N] = card[N - 1];
		for (int i = 1; i < N; i++) {
			mix[i] = card[i - 1] + card[i];
		}
		int sum = mix[N-1] + mix[N];
		System.out.println(sum);
	}

}
