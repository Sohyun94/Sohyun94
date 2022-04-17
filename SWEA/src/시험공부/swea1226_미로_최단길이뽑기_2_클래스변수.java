import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea1226_미로_최단길이뽑기_2_클래스변수 {
	static class Pos {
		int r;
		int c;
		int dist; //시잦ㄱ 위치부터 현재까지 거리를 저장하기 위해 선언

		public Pos(int r, int c, int dist) {
			this.r = r;
			this.c = c;
			this.dist = dist;
		}
	}

	static char[][] map; // 미로 저장할 2차원 배열
	// 4방향 델타 정의 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int N = 16; // 16 * 16이니까
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sc.next(); // 테스트 케이스 번호 버리기
			map = new char[N][]; // 크기 미리 결정
			ans = 0; // 답
			int ansDist = -1;
			Pos st = null;

			for (int i = 0; i < N; i++) {
				map[i] = sc.next().toCharArray();
				for (int j = 0; j < N; j++) {
					// 출발지 찾아 저장
					if (map[i][j] == '2') {
						st = new Pos(i, j, 0);
					}
				}
			} // 멥 입력 끝

			boolean[][] visited = new boolean[N][N];
			// BFS
			// 1. 큐 생성
			Queue<Pos> queue = new LinkedList<>();
			// 2. 시작점 넣기 , 방문 처리
			queue.add(st);
			visited[st.r][st.c] = true;

			// 3. 큐가 공백상태 될 때까지 반복 수행
			while (!queue.isEmpty()) {
				// 3-1. 하나 꺼내기
				Pos curr = queue.poll(); // 누가 예외 던지는지 찾아보깅

				// 3-3. 끝내기
				if (map[curr.r][curr.c] == '3') {
					ans = 1;
					ansDist = curr.dist;
					break;
				}

				// 3-2. 현재 좌표에서 인접한 친구들을 모두 담기
				for (int i = 0; i < 4; i++) {
					int nr = curr.r + dr[i];
					int nc = curr.c + dc[i];

					if (nr < 0 || nr >= N || nc < 0 || nc >= N)
						continue;
					if (map[nr][nc] == '1' || visited[nr][nc])
						continue;

					visited[nr][nc] = true;
					//현재 정점 기준 한 칸 더 나아간 거니까 거리를 1 더하기
					queue.add(new Pos(nr, nc, curr.dist+1));
				} // 4방 탐색
			} // bfs while문
			System.out.println("#" + tc + " " + ans+ " " + ansDist);
		} // tc

	}// main

}
