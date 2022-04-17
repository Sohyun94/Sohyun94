import java.util.PriorityQueue;
import java.util.Scanner;

public class Swea_1251_하나로_크루스칼 {
	static int N; // 섬의 개수
//	static int[][] XY; // [0] : X좌표, [1] : Y좌표
	static int[] X, Y;
	static double E; // 세율
	static double ans; // 정답

	static int[] p; // 내 대표 저장할 배열

	static class Edge implements Comparable<Edge> {
		int st, ed; // 시작점, 끝점
		double cost; // 비용

		public Edge(int st, int ed) {
			this.st = st;
			this.ed = ed;
			this.cost = distance(st, ed);
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost > o.cost ? 1 : -1;
		}
	}

	static PriorityQueue<Edge> pq = new PriorityQueue<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			X = new int[N];
			Y = new int[N];
			p = new int[N]; // 대표

			ans = 0;
			pq.clear();

			for (int i = 0; i < N; i++)
				X[i] = sc.nextInt();
			for (int i = 0; i < N; i++)
				Y[i] = sc.nextInt();

			E = sc.nextDouble();

			// makeset
			for (int i = 1; i < N; i++) {
				p[i] = i;
			}

			// 간선을 몽땅 만들어 pq에 넣기
			// 조합
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					pq.add(new Edge(i, j));
				}
			}

			// 크루스칼 돌릴 건데 간선 몇 개? N-1개
			for (int i = 0; i < N - 1; i++) {
				// 힙에서 꺼내기
				while (true) {
					Edge edge = pq.poll();
					int px = findSet(edge.st);
					int py = findSet(edge.ed);

					if (px != py) {
						union(px, py);
						ans += edge.cost;
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + Math.round(ans));
		} // tc

	}// main

	static double distance(int idx1, int idx2) {
		// 두 개의 좌표를 이용해 가중치 구하기
		return (Math.pow(Math.abs(X[idx1] - X[idx2]), 2) + Math.pow(Math.abs(Y[idx1] - Y[idx2]), 2)) * E;
	}

	static int findSet(int x) {
		if (p[x] != x) {
			p[x] = findSet(p[x]);
		}
		return p[x];
	}

	static void union(int x, int y) {
		p[y] = x;
	}

}
