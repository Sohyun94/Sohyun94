package ch3;

import java.util.Scanner;

public class B11696_책 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수의 개수
		int M = sc.nextInt(); // 합을 구해야 하는 횟수
		int[] arr = new int[N + 1]; // 수 담아 줄 배열
		int[] arrSum = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 2; i <= N; i++) {
			arrSum[1] = arr[1];
			arrSum[i] += arrSum[i - 1] + arr[i];
		}
		
		// 구간 합 공식 (구간: i ~ j)
		// S[j] - S[i-1];
		

		for (int tc = 0; tc < M; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = arrSum[b] - arrSum[a - 1];
			System.out.println(sum);
		}

	}
}