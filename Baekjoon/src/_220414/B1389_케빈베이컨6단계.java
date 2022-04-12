package _220414;

import java.util.Scanner;

public class B1389_케빈베이컨6단계 {
	// 플로이드 와샬 알고리즘 (DP의 일종)
	// : 음수 사이클이 없는 그래프 내 모든 정점에서 각 모든 정점까지의 최단거리 구하는 알고리즘
	// : 그래프에 음수 사이클만 없다면 음의 가중치를 갖는 간선이 존재해도 상관없다
	// : 인접 행렬 이용하여 계산
	// -> 모든 노드에서 노드로 가는 최소 비용 '단계적' 갱신
	// -> 단계적 갱신이란? 간선의 개수를 0개에서 N개에 도달하기까지 몇 개의 간선을 거쳐서
	// 해당 노드로 가는지를 모두 고려 (여기서 N개란 총 노드의 개수)
	// 연결 안 되어 있으면 큰 값으로 채워 넣기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt(); // 유저의 수
		int friend = sc.nextInt(); // 친구 관계의 수
		int[][] dist = new int[user + 1][user + 1]; // 초기 거리 담을 배열

		// 초기 거리 배열 만들기
		for (int i = 1; i <= user; i++) {
			for (int j = 1; j <= user; j++) {
				// 간선이 0일 때, 자기 자신으로 가는 길은 가중치 0
				if (i == j)
					dist[i][j] = 0;
				// 아니라면 갈 수 없으므로 아주 큰 값으로 지정해 주기
				else if (i != j)
					dist[i][j] = 99999999;
			}
		} // 초기 거리 배열 만들기 끝

		// 친구 관계인 사람들 받기
		for (int i = 0; i < friend; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 원래는 여기서 가중치를 받고 최소 비용을 저장해 줘야 하는데, 해당 문제에서는 연결되어 있으면
			// 아는 사이라는 조건만 있으므로 간선이 연결되어 있는 경우 1로 놓기
//			int value = sc.nextInt();
//			dist[a][b] = Math.min(dist[a][b], value);
//			dist[b][a] = Math.min(dist[b][a], value);

			// 문제 조건: A-B가 아는 사이라면 B-A도 마찬가지고, A와 B가 같은 경우는 없다(두 사람이 같은 번호 X)
			dist[a][b] = dist[b][a] = 1;
		} // 친구 관계 받기 끝

		// 플로이드 워셜 알고리즘
		// 사람을 1명부터 user 수까지 거쳐서 이동하는 경우 고려하기
		for (int i = 1; i <= user; i++) {
			// user j에서 k로 가는 경우
			for (int j = 1; j <= user; j++) {
				// i 번째 노드를 거쳐 가는 비용이 기존 비용보다 더 작은 경우 갱신
				// 혹은 연결이 안 되어 있어서 가장 큰 수로 되어 있던 경우에도 갱신
				for (int k = 1; k <= user; k++) {
					dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
				}

			}
		} // f-w 알고리즘 끝
		int min = Integer.MAX_VALUE; // 최솟값 초기화
		int idx = 0; // 정답 (번호 가장 작은 사람)

		for (int i = 1; i <= user; i++) {
			int sum = 0;
			for (int j = 1; j <= user; j++)
				sum += dist[i][j];
			if (min > sum) {
				min = sum;
				idx = i;
			}
		}
		System.out.println(idx);
	}// main
}
