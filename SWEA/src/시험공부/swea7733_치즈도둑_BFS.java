import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea7733_치즈도둑_BFS {
	static class Pos {
		int r, c;

		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int[][] cheese; // 치즈 저장할 2차원 배열
	static boolean[][] visited; // 방문처리
	static int N; // 한 변의 길이 저장 2 <= N <= 100
	static int[] dr = { -1, 1, 0, 0 }; // 문제에서 인접한 4방향으로 이야기했으니 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();

			cheese = new int[N][N];
			visited = new boolean[N][N];

			int maxH = -1; // 가장 맛있는 치즈
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					cheese[i][j] = sc.nextInt();
					maxH = Math.max(maxH, cheese[i][j]);
				}
			} // 치즈 입력 끝
			int ans = 1;
			// 각각의 일차 진행시키면서 최대 덩이 찾기
			for (int h = 1; h < maxH; h++) {
				// 전체를 탐색하며 살아남은 치즈 표시
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (cheese[r][c] > h) // 앞으로 먹어야 할 것
							visited[r][c] = false;
						else // 요정이 이미 먹음
							visited[r][c] = true;
					} // dfs 탐색
				}
				bfs();
			} // 일차 진행시키는 반복문
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main

	private static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 내가 먹었거나 요정이 먹었거나
				if (visited[i][j])
					continue;
				// 시작점이니까
				q.add(new Pos(i, j));
				visited[i][j] = true;
				cnt++;

				while (!q.isEmpty()) {
					Pos p = q.poll();

					for (int d = 0; d < 4; d++) {
						int nr = p.r + dr[d];
						int nc = p.c + dc[d];

						if (nr < 0 || nc < 0 || nr >= N || nc >= N || visited[nr][nc])
							continue;
						
						visited[nr][nc] = true;
						q.add(new Pos(nr, nc));
					}
				} // 큐를 while
			}
		}

	} // bfs 메서드

}
