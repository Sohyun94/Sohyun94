import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B토마토 {
	static class Tomato {
		int r, c;

		public Tomato(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}

	static int N, M; // N: 행, M: 열
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우 델타
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();

		int[][] box = new int[N][M];

		int empty = N * M; // box에 담는 토마토의 총량

		Queue<Tomato> q = new LinkedList<>();

		// 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				box[i][j] = sc.nextInt();
				// 입력: 0 or 1 or -1

				// if(box[i][j] != 0) --empty;
				// if(box[i][j] == 1) q.add(new Tomato(i, j));
				switch (box[i][j]) {
				case 1: // 토마토라면 넣기
					q.add(new Tomato(i, j)); // 여기에 걸리면 break 만날 때까지 수행
					// --empty;
					// break; 이렇게도 가능
				case -1: // 빈 공간이라면 칸만 까기, 토마토일 때도 까기 (아무튼 칸은 까야 됨)
					--empty;
					break;
				}
			}
		} // 입력 끝

		// BFS 탐색
		int days = 0;

		while (!q.isEmpty() && empty != 0) {
			// 큐 사이즈로 묶어서 처리
			int size = q.size();

			// 같은 날짜의 친구끼리만 처리
			for (int i = 0; i < size; i++) {
				Tomato t = q.poll();

				for (int d = 0; d < 4; d++) {
					int nr = t.r + dr[d];
					int nc = t.c + dc[d];

					if (nr < 0 || nc < 0 || nr >= N || nc >= N || box[nr][nc] != 0)
						continue;

					box[nr][nc] = 1;
					q.add(new Tomato(nr, nc));
					--empty;
				}
			}
			++days; // 하루 경과
		}
		System.out.println(empty == 0 ? days : -1);
	}

}
