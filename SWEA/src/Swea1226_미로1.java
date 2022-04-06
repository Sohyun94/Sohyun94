import java.util.Scanner;

public class Swea1226_미로1 {
	static char[][] map; // 미로 저장할 2차원 배열
	// 4방향 델타 정의 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int N = 100; // 16 * 16이니까
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sc.next(); // 테스트 케이스 번호 버리기
			map = new char[N][]; // 크기 미리 결정
			ans = 0; // 답

			int stR = -1;
			int stC = -1;

			for (int i = 0; i < N; i++) {
				map[i] = sc.next().toCharArray();
				for (int j = 0; j < N; j++) {
					// 출발지 찾아 저장
					if (map[i][j] == '2') {
						stR = i;
						stC = j;
					}
				}
			} // 멥 입력 끝
			dfs(stR, stC);
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main
	static void dfs(int r, int c) {
		// 1. 기본 구간
		if(map[r][c] == '3') {
			ans = 1;
			return;
		}
		// 2. 순환 구간 : 방문 처리
		map[r][c] = '1'; //벽으로 바꿈
		
		//내가 갈 수 있는 곳 가기
		for(int i = 0; i< 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			//갈 수 있는 곳인지 확인 후 재귀호출
			if(nr < 0 || nr >= N || nc < 0 || nc >= N)
				continue;
			//벽이니?
			if(map[nr][nc] == '1')
				continue;
			dfs(nr, nc);
		}
	}

}