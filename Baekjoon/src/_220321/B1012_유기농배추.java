package _220321;

import java.util.Scanner;

public class B1012_유기농배추 {
	// 찾아보니까 BFS나 DFS를 이용하여 풀어야 하는 문제인 듯하다
	// 아직 그 둘 어떻게 하는지 모르겠어서 풀이 참고함 ㅎㅎ
	static int M, N, K; // 배추밭 가로, 세로, 배추 위치 개수
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };
	static int[][] farm; // 밭
	static boolean[][] visit; // 해당 위치에 들렀는지 확인할 boolean 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			farm = new int[M][N];
			visit = new boolean[M][N];
			for (int i = 0; i < K; i++) { // 배추 입력받기
				int x = sc.nextInt();
				int y = sc.nextInt();
				farm[x][y] = 1;
			} // for문
			int warm = 0; // 지렁이 수
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (farm[i][j] == 1 && !visit[i][j]) { // 배추가 있고 방문하지 않았으면
						dfs(i, j); // dfs 탐색
						warm++; // 지렁이 증가
					}
				}
			} // for문
			System.out.println(warm);
		} // tc

	}// main

	public static void dfs(int r, int c) {
		visit[r][c] = true; // 방문 여부 확인
		for (int i = 0; i < 4; i++) {// 사방 탐색
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (nr >= 0 && nc >= 0 && nr < M && nc < N) { // 밭 안 벗어나면서
				if (farm[nr][nc] == 1 && !visit[nr][nc]) { //배추가 있고 방문하지 않았으면
					dfs(nr, nc); //dfs 탐색
				}
			}
		}
	}
}
