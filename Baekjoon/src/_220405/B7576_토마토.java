package _220405;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B7576_토마토 {
	static int[] dr = new int[] { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = new int[] { 0, 0, -1, 1, };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // 가로
		int N = sc.nextInt(); // 세로
		int[][] tomato = new int[N][M]; // 토마토 배열
		Queue<int[]> qToma = new LinkedList<>(); // 토마토 큐
		int cnt = 0; // 안 익은 토마토 나오면 count,
		int day = 0; // 정답

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tomato[i][j] = sc.nextInt(); // 토마토 밭 저장
				if (tomato[i][j] == 1) // 익은 토마토면 큐에 그냥 저장
					qToma.add(new int[] { i, j });
				else if (tomato[i][j] == 0) {
					cnt++;
				}
			}
		} // 마토 입력 끝

		while (cnt > 0 && !qToma.isEmpty()) { // 안 익은 토마토 있고 큐가 안 비었을 때
			for (int i = qToma.size(); i > 0; i--) { // 뒤에서부터 빼기
				int[] cur = qToma.poll();

				for (int d = 0; d < 4; d++) { // 사방탐색
					int nr = cur[0] + dr[d];
					int nc = cur[1] + dc[d];

					if (nr < 0 || nc < 0 || nr >= N || nc >= M || tomato[nr][nc] != 0) // 범위 벗어나거나 익힐 토마토 없음 중단
						continue;
					cnt--;
					tomato[nr][nc] = 1; // 카운트 하나 줄고 토마토 익음
					qToma.add(new int[] { nr, nc }); // 익은 토마토로 다시 넣음
				}
			}
			day++; // 하루 지남
		}
		System.out.println(cnt == 0 ? day : -1); // 익힐 토마토 없을 때 나온 값 출력
	}// main

}
