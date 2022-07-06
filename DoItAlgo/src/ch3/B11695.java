package ch3;

import java.util.Scanner;

public class B11695 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수의 개수
		int M = sc.nextInt(); // 합을 구해야 하는 횟수
		int[] arr = new int[N]; // 수 담아 줄 배열
		int[] arrSum = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			arrSum[0] = arr[0];
			arrSum[i + 1] += arrSum[i] + arr[i + 1];
		}

//		for (int i = 0; i < N; i++) {
//			System.out.print(arrSum[i] + " ");
//		}

		for (int tc = 0; tc < M; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = arrSum[N - 1] - arr[a - 1] - arr[b - 1];
			System.out.println(sum);
		}

	}
}