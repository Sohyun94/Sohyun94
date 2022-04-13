package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B1197_최소스패닝트리_프림 {
	static class Edge implements Comparable<Edge> {
		int st;
		int ed;
		int cost;

		public Edge(int st, int ed, int cost) {
			this.st = st;
			this.ed = ed;
			this.cost = cost;
		}

		// 우선 순위 큐를 만드는데 최소 힙
		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
//			return Integer.compare(this.cost, o.cost);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt(); // 정점의 갯수
		int E = sc.nextInt();

		// 간선의 정보를 저장을 해야되는데
		// 인접 리스트

		List<Edge>[] adjList = new ArrayList[V + 1];

		for (int i = 1; i <= V; i++)
			adjList[i] = new ArrayList<>();

		for (int i = 0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();

			adjList[st].add(new Edge(st, ed, w));
			adjList[ed].add(new Edge(ed, st, w));
		}

		boolean[] visited = new boolean[V + 1];// 박문철2 용도

		PriorityQueue<Edge> pq = new PriorityQueue<>();

		visited[1] = true;// 0번부터 시작할꺼야
//		for(int i = 0 ; i<adjList[0].size(); i++)
//			pq.add(adjList[0].get(i));

		pq.addAll(adjList[1]); // 이거 몽땅 넣어줘잉

		int cnt = 1; // 확보한 정점의 갯수
		int ans = 0;

		while (cnt != V) {
			Edge edge = pq.poll(); // 간선 하나 꺼내기.
			// 이미 확보한 정점이면... 넘어가
			if (visited[edge.ed])
				continue;

			ans += edge.cost;
			pq.addAll(adjList[edge.ed]);
			visited[edge.ed] = true;
			cnt++;
		}

		System.out.println(ans);

	}// main
}