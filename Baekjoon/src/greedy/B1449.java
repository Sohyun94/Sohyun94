package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 물 새는 곳 개수
		int L = sc.nextInt(); // 테이프 길이

		int cnt = 1; // 테이프 개수
		// 물 새는 곳이 하나여도 기본적으로 테이프 1개 붙여야 한다

		int[] leak = new int[N]; // 물 새는 곳 담아 줄 배열
		for (int i = 0; i < N; i++) {
			leak[i] = sc.nextInt();
		}
		// 가장 처음에 커버 가능한 부분
		Arrays.sort(leak);
		int cover = (int)(leak[0] - 0.5 + L);

		for (int i = 1; i < leak.length; i++) {
			// 커버해야 할 범위가 더 크면
			if (cover < (int)(leak[i] + 0.5)) {
				cover = (int)(leak[i] - 0.5 + L);
				// 늘려 주기
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
