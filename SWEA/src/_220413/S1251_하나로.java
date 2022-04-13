package _220413;

import java.util.Arrays;
import java.util.Scanner;

public class S1251_하나로 {
//프림 알고리즘
// 1. 시작 정점 선택
// 2. 시작 정점으로부터 최소 비용 가진 간선 선택
// 3. 모든 정점 방문할 때까지 반복
	static int N; // 섬의 개수
	static int[] X, Y;
	static double E; // 환경 부담 세율
	static double ans;
	static double[][] adj; // 인접 행렬

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 섬의 개수
			X = new int[N]; // X좌표
			Y = new int[N]; // Y좌표
			adj = new double[N][N]; // 인접 행렬
			ans = 0; // 정답

			for (int i = 0; i < N; i++)
				X[i] = sc.nextInt();
			for (int i = 0; i < N; i++)
				Y[i] = sc.nextInt(); // X랑 Y 좌표 받기

			E = sc.nextDouble(); // 세율 받기

			// 환경 부담금 계산
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					double cost = dist(X[i], X[j], Y[i], Y[j]);
					// 무향이라서 같음, 인접 행렬에 넣어주기
					adj[i][j] = cost;
					adj[j][i] = cost;
				}
			} // 계산 끝
			boolean[] visit = new boolean[N]; // 방문 처리
			double[] distance = new double[N]; // 거리 담기
			Arrays.fill(distance, Double.MAX_VALUE); // 배열 가장 큰 수로 채워 넣기

			distance[0] = 0; // 제일 처음 꺼내는 애는 0으로 갱신

			for (int i = 0; i < N - 1; i++) {
				double minDist = Double.MAX_VALUE; // 최솟값 초기화
				int idx = -1;
				// 아직 선택 안 한 섬 중 최소 거리 고르기
				for (int j = 0; j < N; j++) {
					if (!visit[j] && minDist > distance[j]) {
						minDist = distance[j];
						idx = j;
					}
				}
				// 방문했으니까 true로 갱신
				visit[idx] = true;
				// 인접 행렬 갱신 가능하면 갱신
				for (int j = 0; j < N; j++) {
					if (!visit[j] && adj[idx][j] != 0 && distance[j] > adj[idx][j])
						distance[j] = adj[idx][j];
				}

			} // 거리 구하기 끝
			for (int i = 0; i < N; i++)
				ans += distance[i];
			System.out.println("#" + tc + " " + Math.round(ans));
		} // tc

	} // main

	private static double dist(int x1, int x2, int y1, int y2) {
		// 환경 부담금 : 해저 터널 길이의 제곱 * 환경부담금
		return (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) * E;
	}

}
