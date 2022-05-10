package class2;

import java.util.Scanner;
// 풀이법 헷갈려서 인터넷 참고했다 다음에 다시 풀어봐야겠다

public class B1018_체스판다시칠하기_ {
	public static boolean[][] board; // boolean 배열로 board 받기
	public static int min = 64; // 최솟값

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 세로
		int M = sc.nextInt(); // 가로

		board = new boolean[N][M];

		// 체스판 전체 입력받기
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				// W일 때는 true로 입력받기
				if (str.charAt(j) == 'W') {
					board[i][j] = true;
					// B일 때는 false로 입력받기
				} else {
					board[i][j] = false;
				}

			}
		} // 입력 끝

		// 경우의 수 판별
		int row = N - 7;
		int col = M - 7;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				solve(i, j);
			}
		}
		System.out.println(min);
	}

	private static void solve(int a, int b) {
		int endA = a + 8;
		int endB = b + 8;
		int cnt = 0;

		// 첫 번째 칸 색
		boolean color = board[a][b];

		for (int i = a; i < endA; i++) {
			for (int j = b; j < endB; j++) {

				// 색이 같지 않을 경우 cnt 증가시킴
				if (board[i][j] != color)
					cnt++;
				// 다음 칸은 이전 칸이랑 다른 색이어야 됨
				// 예) B면 W, W면 B
				// 그래서 true랑 false 바꿔줌
				color = (!color);
			}
			color = !color;
		}
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);

	}
}
