package class1;

import java.util.Scanner;

public class B8958_OX퀴즈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0; // O 쌓인 카운트 계산
			int sum = 0; // 합계 계산
			char[] ox = sc.next().toCharArray();
			for (int i = 0; i < ox.length; i++) {
				if (ox[i] == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		} // tc
	}// main

}
