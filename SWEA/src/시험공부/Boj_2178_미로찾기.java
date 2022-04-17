package 시험공부;

import java.util.*;

public class Boj_2178_미로찾기 {

	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, -1, 0, 1 };
	static int N;
	static int M;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		arr = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
				visited[i][j] = false;
			}
		}
		visited[0][0] = true;
		BFS(0, 0);
		System.out.println(arr[N - 1][M - 1]);
	}

	static public void BFS(int r, int c) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(r, c));
		// 큐가 끝날 때까지
		while (!q.isEmpty()) {
			Node node = q.poll();
			for (int d = 0; d < 4; d++) {
				// 다음에 방문할 좌표 nr, nc
				int nr = node.r + dr[d];
				int nc = node.c + dc[d];

				// 다음 좌표가 범위를 넘어갈 때
				if (nr < 0 || nc < 0 || nr >= N || nc >= M) {
					continue;
				}
				// 방문했던 점이면 건너뛰기
				if (visited[nr][nc] || arr[nr][nc] == 0) {
					continue;
				}
				// 다음에 방문할 좌표를 큐에 넣기
				q.add(new Node(nr, nc));
				// 배열 안에 다음 방문할 곳은 현재 방문했던 점보다 1칸 더 가야 하므로 +1
				arr[nr][nc] = arr[node.r][node.c] + 1;
				// 다음 좌표는 방문 표시
				visited[nr][nc] = true;
			}
		}
	}
}

class Node {
	int r;
	int c;

	Node(int r, int c) {
		this.r = r;
		this.c = c;
	}
}
