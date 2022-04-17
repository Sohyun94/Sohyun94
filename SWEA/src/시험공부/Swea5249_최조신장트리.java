import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Swea5249_최조신장트리 {
	static class Edge { // 간선 정보 관리할 Edge 클래스 생성
		int start; // 시작점
		int end; // 끝점
		int value; // 가중치

		public Edge(int start, int end, int value) {
			this.start = start;
			this.end = end;
			this.value = value;
		}
	}

	// 우선순위 큐에서 가중치 순으로 간선 비교하게끔 만들기
	static class EdgeComparator implements Comparator<Edge> {
		@Override
		public int compare(Edge o1, Edge o2) {
			return o1.value - o2.value;
		}

	}

	// V: 마지막 노드 번호인데 1 더해서 노드 개수로 이용할 것
	// E: 간선 수, rep: 각 정점 대표자 정보 저장 배열
	static int V, E, rep[];
	// 방문 체크할 boolean 배열
	static boolean[] visit;
	// 최소 신장 트리 list
	static ArrayList<Edge> mst;
	// 간선들 가중치로 정렬할 것이기 때문에 우선순위 큐 생성
	static PriorityQueue<Edge> pq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			V = sc.nextInt() + 1;
			E = sc.nextInt();
			long ans = 0; // 정답
			visit = new boolean[V + 1];
			rep = new int[V + 1];
			// 간선들 가중치 비교
			pq = new PriorityQueue<>(new EdgeComparator());
			mst = new ArrayList<>();

			for (int i = 0; i < E; i++) {
				int start = sc.nextInt(); // 시작점
				int end = sc.nextInt(); // 끝점
				int value = sc.nextInt(); // 가중치
				// 간선 정보를 받아 우선 순위 큐에 넣어 정렬
				pq.add(new Edge(start, end, value));
			} // 간선 받기 끝
			kruskal();
			for (int i = 0; i < mst.size(); i++) {
				// mst에 있는 가중치 다 가져와서 더해 주기
				ans += mst.get(i).value;
			}
			System.out.println("#" + tc + " " + ans);
		} // tc

	} // main

	// 크루스칼 알고리즘
	private static void kruskal() {
		// 모든 정점별로 대표 지정(스스로)
		for (int i = 1; i <= V; i++) {
			rep[i] = i;
		}

		for (int i = 0; i < E; i++) {
			// 우선순위 큐에 들어갔던 걸 꺼내기 떄문에
			// 가중치가 작은 간선이 먼저 나옴
			Edge edge = pq.poll();
			// 간선의 끝점과 시작점의 대표자가 같으면 사이클이 생성되므로 패스
			if (find(edge.start) == find(edge.end))
				continue;
			// 사이클 안 생기는 두 간선 합집합 만들긴
			union(edge.start, edge.end);
			// 최소 신장 트리 list에 넣어주기
			mst.add(edge);
		}

	}

	private static void union(int a, int b) {
		// find 메서드로 찾은 각각의 대표자들
		int repA = find(a);
		int repB = find(b);

		// 대표자가 다르면 합치기
		if (repA != repB)
			rep[repA] = repB;

	}

	// 특정한 원소 x가 들어 있는 집합의 대표자 찾기
	private static int find(int x) {
		if (rep[x] == x)
			return x;
		rep[x] = find(rep[x]);
		return rep[x];
	}

}
