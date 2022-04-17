import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Swea_1251_하나로_프림 {
	static int N; // 섬의 개수
//	static int[][] XY; // [0] : X좌표, [1] : Y좌표
	static int[] X, Y;
	static double E; // 세율
	static double ans; // 정답
	static double[][] adj; // 인접행렬

	static int[] p; // 내 대표 저장할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			X = new int[N];
			Y = new int[N];

			ans = 0;
			adj = new double[N][N];// 인접행렬 만들기

			for (int i = 0; i < N; i++)
				X[i] = sc.nextInt();
			for (int i = 0; i < N; i++)
				Y[i] = sc.nextInt();

			E = sc.nextDouble();

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					double cost = distance(X[i], X[j], Y[i], Y[j]);
					adj[i][j] = cost;
					adj[j][i] = cost; // 무향
				}
			}

			boolean[] visited = new boolean[N]; // 방문처리
			double[] dist = new double[N];
			Arrays.fill(dist, Double.MAX_VALUE);

			dist[0] = 0;

			for (int i = 0; i < N - 1; i++) {
				double min = Double.MAX_VALUE;
				int idx = -1;
				// 아직 안 고른 친구 중 거리가 가장 작은 것 찾기
				for (int j = 0; j < N; j++) {
					if (!visited[j] && dist[j] < min) {
						min = dist[j];
						idx = j;
					}
				}
				visited[idx] = true;
				// ans += dist[idx]; // 어떤 경우 의미가 있는지?
				//갱신할 수 있으면 죄다 갱신
				for(int j = 0; j < N; j++) { // 인접 행렬이라서
					if(!visited[j] && adj[idx][j] != 0 && dist[j] > adj[idx][j]) {
						dist[j] = adj[idx][j];
					}
				}
			}
			for(int i = 0; i < N; i++) {
				ans += dist[i];
			}
			System.out.println("#" + tc + " " + Math.round(ans));
		} // tc

	}// main

	static double distance(int x1, int x2, int y1, int y2) {
		// 두 개의 좌표를 이용해 가중치 구하기
		return (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) * E;
	}

}
