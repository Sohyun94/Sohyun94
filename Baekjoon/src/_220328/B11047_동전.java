package _220328;

import java.util.Scanner;

public class B11047_동전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt(); // 동전 종류
		int sum = sc.nextInt(); // 가치의 합
		int[] value = new int[coin]; // 가지고 있는 동전 가치
		int ans = 0; // 정답 담을 변수
		for (int i = 0; i < coin; i++) {
			value[i] = sc.nextInt(); // 동전 가치 받기
		} // 오름차순이라 정렬 필요 X
		for (int i = value.length - 1; i >= 0; i--) { // 배열 뒤에셔부터 확인
			if (sum >= value[i]) { // 합계가 동전 가치보다 크거나 같으면
				ans += sum / value[i]; // 정답에 몫 더해주기
				sum %= value[i]; // 나누고 남은 나머지 다시 합계에 담음
			}
		} // for문 끝
		System.out.println(ans);

	}// main

}
