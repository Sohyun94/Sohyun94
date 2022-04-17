package 시험공부;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B1197_최소스패닝트리_크루스칼 {
	static int V, E; // 정점, 간선
	static int[] p; // 부모 저장 배열
	static PriorityQueue<Edge> pq; // 우선순위 큐

	static class Edge implements Comparable<Edge> {
		int st, ed, value; // 시작점, 끝점, 가중치

		public Edge(int st, int ed, int value) {
			this.st = st;
			this.ed = ed;
			this.value = value;
		}

		@Override
		public int compareTo(Edge o) {
			return this.value - o.value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt(); // 정점
		E = sc.nextInt(); // 간선
		p = new int[V + 1]; // 부모 배열

		// makeset (자신 가리키게끔 지정)
		for (int i = 1; i <= V; i++)
			p[i] = i;

		// 우선순위큐 생성
		pq = new PriorityQueue<>();
		for (int i = 0; i < E; i++) {
			int a = sc.nextInt(); // a번 정점
			int b = sc.nextInt(); // b번 정점
			int c = sc.nextInt(); // 가중치
			// 우선순위큐에 정보 넣기
			pq.offer(new Edge(a, b, c));
		} // 입력값 받기 끝
		int value = 0;
		// 큐가 빌 때까지 꺼내기
		while (!pq.isEmpty()) {
			Edge curr = pq.poll();
			// 두 노드가 부모가 다르면 합치기
			if (findSet(curr.st) != findSet(curr.ed)) {
				union(curr.st, curr.ed);
				// 가중치 더해주기
				value += curr.value;
			}
		}
		System.out.println(value);
	}// main

	private static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);

		if (px < py)
			p[py] = px;
		else
			p[px] = py;

	}

	// 부모 찾기
	private static int findSet(int V) {
		if (p[V] != V)
			p[V] = findSet(p[V]);
		return p[V];
	}

}
