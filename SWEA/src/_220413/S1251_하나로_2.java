package _220413;

import java.util.PriorityQueue;
import java.util.Scanner;

public class S1251_하나로_2 {
//	크루스칼 알고리즘
//	1. 모든 간선을 연결 비용이 낮은 순으로 오름차순 정렬
//	2. 정렬된 순서대로 간선을 선택하며, 간선의 양끝 정점을 Union
//	3. 선택된 두 정점이 같은 집합에 속해 있으면 사이클로 판단하여 미포함
//	4. 최종 선택된 간선 연결
	static int N; // 섬의 개수
	static int[] X, Y; // X, Y 좌표
	static double E; // 환경 부담 세율
	static double ans; // 정답
	static int[] p; // 부모 저장 배열

	static class Edge implements Comparable<Edge> {
		int st, ed; // 시작점과 끝점
		double cost; // 비용

		public Edge(int st, int ed) {
			this.st = st;
			this.ed = ed;
			this.cost = distance(st, ed);
		}

		// 좌표 이용하여 가중치 구하기
		private double distance(int idx1, int idx2) {
			return (Math.pow(X[idx1] - X[idx2], 2) + Math.pow(Y[idx1] - Y[idx2], 2)) * E;
		}

		// 비교 메서드
		@Override
		public int compareTo(Edge o) {
			return this.cost > o.cost ? 1 : -1;
		}
	}

	// 간선들 넣어 비교해줄 우선순위 큐 생성
	static PriorityQueue<Edge> pq = new PriorityQueue<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 섬 개수
			X = new int[N]; // X 좌표
			Y = new int[N]; // Y 좌표
			ans = 0;
			p = new int[N]; // 부모(대표자) 배열

			// 큐 비우기
			pq.clear();

			for (int i = 0; i < N; i++)
				X[i] = sc.nextInt();
			for (int i = 0; i < N; i++)
				Y[i] = sc.nextInt();

			E = sc.nextDouble(); // 세율 받기

			// makeset
			for (int i = 0; i < N; i++)
				p[i] = i; // 자신을 가리키게끔 하기

			// 간선 만들어서 pq에 넣기
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					pq.add(new Edge(i, j));
				}
			} // 간선 넣기 끝

			// 간선 뽑기 (정점 개수 - 1)
			for (int i = 0; i < N - 1; i++) {
				while (true) {
					// 힙에서 꺼내기
					Edge edge = pq.poll();
					int px = findset(edge.st);
					int py = findset(edge.ed);

					if (px != py) {
						// 부모가 서로 안 같으면 합치기
						union(px, py);
						ans += edge.cost;
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + Math.round(ans));
		} // tc

	}// main

	private static void union(int x, int y) {
		p[y] = x;

	}

	// 부모 찾기
	private static int findset(int x) {
		if (p[x] != x) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}

}
