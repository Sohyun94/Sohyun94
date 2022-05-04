package class2;

import java.util.Scanner;

public class B2775_부녀회장이될거야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			int floor = sc.nextInt(); // 층
			int room = sc.nextInt(); // 호수
			// 0층~14층, 1호~14호까지 있으므로
			int[][] apt = new int[15][15];
			for (int i = 0; i <= 14; i++) {
				// 층을 막론하고 1호에는 모두 1명만 산다
				apt[i][1] = 1;
				// 0층에는 호수 숫자만큼의 주민이 산다
				apt[0][i] = i;
			}
			// 그림 그리면 쉽게 풀 수 있다
			for (int i = 1; i <= 14; i++) {
				for (int j = 0; j <= 13; j++) {
					apt[i][j + 1] = apt[i][j] + apt[i - 1][j + 1];
				}
			}
			System.out.println(apt[floor][room]);
		}

	}

}
