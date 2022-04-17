package 시험공부;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 그래프05_프림2 {
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
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt();

		// 간선의 정보를 저장을 해야되는데
		// 인접 리스트

		List<Edge>[] adjList = new ArrayList[V];

		for (int i = 0; i < V; i++)
			adjList[i] = new ArrayList<>();

		for (int i = 0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();

			adjList[st].add(new Edge(st, ed, w));
			adjList[ed].add(new Edge(ed, st, w));
		}

		boolean[] visited = new boolean[V];// 박문철2 용도

		PriorityQueue<Edge> pq = new PriorityQueue<>();

		visited[0] = true;// 0번부터 시작
//		for(int i = 0 ; i<adjList[0].size(); i++)
//			pq.add(adjList[0].get(i));

		pq.addAll(adjList[0]); // 이거 몽땅 넣어줘잉

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
		System.out.println(pq.size());

		System.out.println(ans);

	}// main

	static String input = "7 11 \r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n";
}
