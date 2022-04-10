package _220410;

import java.util.Scanner;
// 전략은... 우하 -> 좌하 -> 좌상 -> 우상의 세 번의 방향 전환을 통해
// 원래 점으로 돌아와 사각형을 만들어야 함

public class S2105_디저트카페 {
	// N : 지역 한 변의 길이, max: 최대 디저트 수, map : 디저트 카페 지도
	static int N, max, map[][];
	static int[] dr = { 1, 1, -1, -1 }; // 우하, 좌하, 좌상, 우상
	static int[] dc = { 1, -1, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 한 변 길이
			max = -1; // 정답

			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			} // 디저트 카페 지도 받기 끝

			// 사각형 만들 수 있는 범위 (그림 그리면 알 수 있음)
			for (int i = 0; i < N - 2; i++) {
				for (int j = 1; j < N - 1; j++) {
					recur(i, j, i, j, new boolean[101], 0, 1);
				}
			}
			System.out.println("#" + tc + " " + max);
		} // tc

	}// main

	// 재귀 메서드 실행
	private static void recur(int topR, int topC, int nr, int nc, boolean[] visit, int dir, int total) {
		// 방문 여부 판별할 boolean
		// 같은 개수의 디저트 판매하는 가게는 갈 수 없음
		visit[map[nr][nc]] = true;
		// 3 넘으면 사각형을 못 만드므로
		if (dir > 3)
			return;
		// 방향에 따른 좌표 변화 기록
		nr += dr[dir];
		nc += dc[dir];
		// 세 번의 방향 변화를 통해 사각형 구성
		if (nr == topR && nc == topC) { // 이 경우 원점으로 돌아온 것이기 때문에 좌표가 같아야 한다
			max = max > total ? max : total; // 최댓값 구하기
			return;
		}
		if (nr < 0 || nc < 0 || nr > N - 1 || nc > N - 1 || nr < topR)
			return;
		// 이미 방문한 디저트 가게라면
		if (visit[map[nr][nc]])
			return;

		// 재귀 시작
		visit[map[nr][nc]] = true;
		recur(topR, topC, nr, nc, visit, dir, total + 1);
		recur(topR, topC, nr, nc, visit, dir+1, total + 1);
		visit[map[nr][nc]] = false;
	} // 메서드 끝

}
