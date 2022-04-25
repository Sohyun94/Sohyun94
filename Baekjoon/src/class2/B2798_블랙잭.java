package class2;

import java.util.Scanner;

public class B2798_블랙잭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드 개수
		int M = sc.nextInt(); // 넘어서면 안 될 수
		int ans = 0; // 갱신 전 근사치
		int[] card = new int[N]; // 카드 배열
		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		} // 카드 배열에 카드 담기
		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
						if (ans < card[i] + card[j] + card[k] && card[i] + card[j] + card[k] <= M)
							ans = card[i] + card[j] + card[k];
					}
				}
			}
		System.out.println(ans);
	}

}
