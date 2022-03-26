package _220321;

import java.util.Arrays;
import java.util.Scanner;

public class B11650_좌표정렬 {

	public static void main(String[] args) {
		// 참고: https://st-lab.tistory.com/243, https://st-lab.tistory.com/110
		// 랆다식 이용 (매개변수, ... , ... ) -> {함수;}
		// 1.
		// public int sum(int a, int b) {
		// return a + b;
		// }
		// -> 람다식 (int a, int b) -> {return a + b;}
		// 2.
		// int c = sum(a, b);
		// public int sum(int a, int b) {
		// return a+ b;
		// }
		// -> 람다식 int c = (int a, int b) -> {return a + b;}
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[][] = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		} // 입력받기
		Arrays.sort(arr, (s1, s2) -> {
			if (s1[0] == s2[0]) {
				return s1[1] - s2[1];
			} else {
				return s1[0] - s2[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}// main
}