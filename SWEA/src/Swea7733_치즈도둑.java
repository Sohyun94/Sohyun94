import java.util.Scanner;

public class Swea7733_치즈도둑 {
	static int[][] cheese; // 치즈 저장할 2차원 배열
	static boolean[][] visited; // 방문 처리
	static int N; // 한 변의 길이 저장 2 <= N <= 100
	static int[] dr = { -1, 1, 0, 0 }; // 문제에서 인접한 4방향으로 이야기했으니 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 치즈 한 변 길이

			cheese = new int[N][N]; // 치즈 배열

			int maxH = -1; // 가장 맛있는 치즈 -1로 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					cheese[i][j] = sc.nextInt(); // 치즈 상태 받아 주기
					maxH = Math.max(maxH, cheese[i][j]); // 가장 맛있는 치즈 max에 저장
				}
			} // 치즈 입력 끝
			int ans = 1;
			// 각각의 일차 진행시키면서 최대 덩이 찾기
			for (int h = 1; h < maxH; h++) {
				visited = new boolean[N][N]; // 방문 처리 초기화
				int cnt = 0; // 이번 일차의 덩어리 수 카운팅
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						// 시작점 찾기
						// 아직 방문 안 했고, 높이보다 치즈 맛이 더 커야 됨
						//(작으면 이미 먹은 치즈)
						if (!visited[r][c] && cheese[r][c] > h) {
							cnt++;
							dfs(r, c, h);
						} // dfs 탐색
					}
				}
				// 이번 일차 먹기 끝
				if (cnt > ans)
					ans = cnt;
			} // 일차 진행시키는 반복문
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main

	private static void dfs(int r, int c, int h) {
		visited[r][c] = true; // 치즈 먹음

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			//범위 벗어나면 패스
			if (nr < 0 || nc < 0 || nr >= N || nc >= N)
				continue;
			// 치즈 높이랑 맛이 같거나 작아도 패스
			if (visited[nr][nc] || cheese[nr][nc] <= h)
				continue;
			dfs(nr, nc, h);
		}

	}

}
