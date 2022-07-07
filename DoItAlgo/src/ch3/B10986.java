package ch3;

import java.util.Scanner;

public class B10986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 숫자 개수
		int M = sc.nextInt(); // 나눌 수
		long[] sum = new long[N]; // 합계 담을 배열
		long[] cnt = new long[N]; // 나머지 카운트 담을 배열
		long ans = 0; // 정답
		sum[0] = sc.nextInt(); // 처음 받은 수가 합 배열의 0번째 숫자니까
		for (int i = 1; i < N; i++) {
			sum[i] = sum[i - 1] + sc.nextInt(); // 합 배열 받아 주기
		}

		for (int i = 0; i < N; i++) { // 나머지 연산 배열 받을 반복문
			// 합 배열 나눠주기
			int rest = (int) (sum[i] % M);
			// 나머지가 0이면 정답에 더해주긴
			if (rest == 0)
				ans++;
			// 동일한 나머지의 인덱스 개수 세어주기
			cnt[rest]++;
		}
		for (int i = 0; i < N; i++) {
			// 카운트 배열이 1보다 크면 2개씩 뽑아야 하니까
			if (cnt[i] > 1) {
				// 2개 뽑는 조합
				ans = ans + (cnt[i] * (cnt[i] - 1) / 2);
			}
		}
		System.out.println(ans);
	}

}
