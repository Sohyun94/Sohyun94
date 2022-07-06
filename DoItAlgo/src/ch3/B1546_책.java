package ch3;

import java.util.Scanner;

public class B1546_책 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//합계와 최댓값을 일찌감치 구해서 반복문 사용 줄여 시간 복잡도 낮추기
		double sum = 0.0;
		double max = 0.0;
		for (int i = 0; i < N; i++) {
			if (arr[i] > max)
				max = arr[i];
			sum += arr[i];
		}
		double avg = sum / max * 100 / N;
		System.out.println(avg);
	}

}
