import java.util.Scanner;

public class Swea1247_최적경로 {
	static int num; // 고객의 수
	static int ans; // 최적 경로

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			num = sc.nextInt();
			ans = Integer.MAX_VALUE; // 정답 초기화
			int[][] place = new int[num + 2][2]; // 좌표 저장할 배열(x값, y값)
			boolean[] visited = new boolean[num + 2]; // 방문 여부 체크
			int[] result = new int[num + 2]; // 장소 방문하는 경우

			// 집 좌표 받기
			place[0][0] = sc.nextInt();
			place[0][1] = sc.nextInt();
			// 회사 좌표 받기
			place[num + 1][0] = sc.nextInt();
			place[num + 1][1] = sc.nextInt();
			// 고객 좌표 받기
			for (int i = 1; i <= num; i++) {
				place[i][0] = sc.nextInt();
				place[i][1] = sc.nextInt();
			}
			perm(1, place, result, visited); // 메서드 이용
			System.out.println("#" + tc + " " + ans); // 출력

		} // tc

	}// main

	static void perm(int client, int[][] place, int[] result, boolean[] visited) {
		// 집에 도착했을 떄 거리 계산
		if (client == num + 1) {
			int sum = 0;
			for (int i = 0; i < num + 1; i++) {
				// 음수 나올 수도 있으므로 절댓값으로 합 구해 줌
				sum += Math.abs(place[result[i]][0] - place[result[i + 1]][0])
						+ Math.abs(place[result[i]][1] - place[result[i + 1]][1]);
			}
			//최솟값 구해서 리턴
			ans = Math.min(sum, ans);
			return;
		}
		// 집과 회사 방문 체크
		result[0] = 0;
		visited[0] = true;
		result[num + 1] = num + 1;
		visited[num + 1] = true;

		// 재귀
		for (int i = 1; i < num + 1; i++) {
			// 방문했으면 넘기기
			if (visited[i] == true)
				continue;
			result[client] = i;
			visited[i] = true;
			perm(client + 1, place, result, visited);
			visited[i] = false;

		}
	}

}
