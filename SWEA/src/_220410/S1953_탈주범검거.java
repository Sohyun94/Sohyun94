package _220410;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//이 문제의 핵심은 그 자리에 머무를 수도 있고 파이프 통해서 이동할 수도 있다~
//이걸 기억해서 이동 가능한 장소를 전부 체크하면 되겠다

public class S1953_탈주범검거 {
	// mapN: 지도 세로 크기, mapM: 지도 가로 크기, holeR: 맨홀 세로 위치, holeC: 맨홀 가로 위치
	// time: 탈주 후 경과 시간, place: 탈주범이 있을 수 있는 위치 수
	// map: 지하 터널 지도 2차원 배열
	static int mapN, mapM, holeR, holeC, time, place, map[][];

	// 탈주범이 방문했는지 확인할 boolean 배열
	static boolean[][] visited;

	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	// 파이프 모양에 따라 갈 수 있는 방향 (0: 못 감, 1: 갈 수 있음)
	// 0번: 방향 아무 데도 못 감 // 1번: 상하좌우
	static int[][] pipe = { { 0, 0, 0, 0 }, { 1, 1, 1, 1 },
			// 2번: 상하 // 3번: 좌우 // 4번: 상우
			{ 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 1, 0, 0, 1 },
			// 5번: 하우 // 6번: 하좌 // 7번: 상좌
			{ 0, 1, 0, 1 }, { 0, 1, 1, 0 }, { 1, 0, 1, 0 }

	};

	public static void main(String[] args) {
		// 나는 알고리즘이 너무 험난하고 어려운데..
		// 이 험난한 코딩 테스트의 세상을 내가 잘 헤쳐 나갈 수 있을까? ㅎㅎ
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			mapN = sc.nextInt(); // 지도 세로
			mapM = sc.nextInt(); // 지도 가로
			holeR = sc.nextInt(); // 맨홀 세로
			holeC = sc.nextInt(); // 맨홀 가로
			time = sc.nextInt(); // 탈주 후 경과 시간
			visited = new boolean[mapN][mapM]; // 방문 여부 체크
			place = 0; // 정답 초기화

			map = new int[mapN][mapM]; // 지하 터널 지도
			for (int i = 0; i < mapN; i++) {
				for (int j = 0; j < mapM; j++) {
					map[i][j] = sc.nextInt();
				}
			} // 지도 입력 끝
			find();
			System.out.println("#" + tc + " " + place);
		} // tc

	}// main

	// 방문 가능 장소 찾기 메서드
	private static void find() {
		Queue<int[]> q = new LinkedList<int[]>(); // 위치 저장할 큐 생성

		// 맨홀 위치 저장
		q.offer(new int[] { holeR, holeC });
		// 맨홀 있는 곳 방문한 곳으로 체크
		visited[holeR][holeC] = true;
		// 맨홀 있는 곳에 그대로 머무를 수도 있으니까 장소에 추가하기
		// 즉, 파이프로 아무 데도 이동할 수 없어도 무조건 갈 수 있는 장소는 1 이상임
		place++;

		// curr[]: 현재 위치, currR: 현재 세로, currC: 현재 가로, shape: 터널 구조물 모양
		int curr[], currR, currC, shape, nr, nc;
		// 시간이 0 되기 전까지 반복
		while (--time > 0) {
			int size = q.size();
			// q가 비거나 size가 0 아닐 때까지 반복
			while (!q.isEmpty() && size-- > 0) {
				// q의 top에 있는 거 뺀 게 현재 위치
				curr = q.poll();
				currR = curr[0]; // 세로
				currC = curr[1]; // 가로
				shape = map[currR][currC];

				// 사방탐색
				for (int d = 0; d < 4; d++) {
					// pipe가 0이면 이동 못 하니까 0 아니어야 되고
					// 파이프 모양에 따라 이동
					if (pipe[shape][d] != 0) {
						nr = currR + dr[d];
						nc = currC + dc[d];
						// 이동한 곳이 범위를 벗어나지 않고 아직 방문하지 않았다면
						if ((nr >= 0 && nc >= 0 && nr < mapN && nc < mapM) && map[nr][nc] != 0 && !visited[nr][nc]) {
							// 다음으로 이동할 수 있는지 확인한 후에
							if (check(d, map[nr][nc])) {
								// 큐에 새로운 장소 좌표 넣기
								q.offer(new int[] { nr, nc });
								// 방문한 걸로 바꾸고
								visited[nr][nc] = true;
								// 장소에 추가
								place++;
							}
						}
					}
				}
			}
		}

	} // find 메서드 끝

	// 다음 방향으로 이동 가능한지 찾는 메서드
	// 현재 위치 기준 반대 방향 (이전 터널과 다음 터널은 방향이 반대이니까)
	private static boolean check(int currDir, int nShape) {
		// 1. 상
		if (currDir == 0 && pipe[nShape][1] == 1) {
			return true;
		}
		// 2. 하
		if (currDir == 1 && pipe[nShape][0] == 1) {
			return true;
		}
		// 3. 좌
		if (currDir == 2 && pipe[nShape][3] == 1) {
			return true;
		}
		// 4. 우
		if (currDir == 3 && pipe[nShape][2] == 1) {
			return true;
		}
		return false;
	}

}
