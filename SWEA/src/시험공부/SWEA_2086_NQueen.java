import java.util.Scanner;

public class SWEA_2086_NQueen {
	static int N; // 1 <= N <= 10
	static int[][] map;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			ans = 0;
			map = new int[N][N];
			dropTheQueen(0);

			System.out.println("#" + tc + " " + ans);
		}

	}// main

	static void dropTheQueen(int r) { // 행
		if (r == N) {
			// 끝까지 전부 놓음

			// 이번에 놓은 퀸들이 잘 놓아졌는지 확인 필요

			ans++;
			return;
		}

		// 해당 행에서 Queen을 놓아봐야 된다
		for (int c = 0; c < N; c++) {
			if (check(r, c)) {
				map[r][c] = 1; // 퀸 놓기
				dropTheQueen(r + 1); // 다음 행으로 내려가기
				map[r][c] = 0; // 다음 위해 퀸 다시 회수
			}
		}

	}
	// 행에는 하나만 놓을 거고, 아래는 아직 안 놓았으니 확인 불필요
	// row는 어차피 하나씩 감소
	static int[] dc = { -1, 0, 1 }; // 세 방향만 확인 (왼대각, 위, 오른대각)

	private static boolean check(int r, int c) {
		for (int i = 0; i < 3; i++) {
			int nr = r;
			int nc = c;

			while (true) {
				nr -= 1; // 헹은 무조건 감소
				nc += dc[i];

				if (nr < 0 || nc < 0 || nc >= N)
					break;
				if (map[nr][nc] == 1)
					return false;
			}
		}
		return true;
	}

	private static boolean check2(int r, int c) {
		int left = c;
		int right = c;

		for (int i = r - 1; i >= 0; i--) {
			left--;
			right++;

			if (map[i][c] == 1) // 위쪽 확인
				return false;
			if (left >= 0 && map[i][left] == 1)
				return false;
			if (right < N && map[i][right] == 1)
				return false;
		}
		return true;
	}
}
