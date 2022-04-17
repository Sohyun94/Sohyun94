package 시험공부;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Swea1267_작업순서 {
	//위상 정렬 순서
	// 1. 인접 행렬 배열과 진입 차수 배열 만들어 입력받음
	// 2. 큐에 진입 차수 0인 노드 저장
	// 3. 큐가 빌 때까지 진입 차수 0인 노드 꺼냄
	// 4. 그 노드와 연결된 노드의 진입 차수 1씩 줄임
	// 5. 진입 차수 0이 되면 해당 노드 큐에 넣음

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int node = sc.nextInt(); // 정점
			int edge = sc.nextInt(); // 간선
			int[] indegree = new int[node]; // 진입 차수
			int[][] adj = new int[node][node]; // 인접 행렬

			for (int i = 0; i < edge; i++) {
				int from = sc.nextInt() - 1; // idx 0부터 시작하니까 1씩 뺴주기
				int to = sc.nextInt() - 1;
				adj[from][to] = 1; // 연결되어 있으니까 간선 1
				indegree[to]++; // to에 해당되는 정점 진입 차수 1씩 올려주기
			} // 간선 받기 끝
				// 큐 생성
			System.out.print("#" + tc + " "); // 테스트케이스 출력
			Queue<Integer> q = new LinkedList<>();
			// 진입 차수가 0이면 큐에 넣기
			for (int i = 0; i < node; i++) {
				if (indegree[i] == 0)
					q.add(i);
			} // 큐에 넣기
			while (!q.isEmpty()) {
				// 큐가 빌 때까지 노드 하나씩 꺼내기
				int one = q.poll();
				// 1씩 빼서 받았으니까 출력 시에는 1씩 더하기
				System.out.print((one + 1) + " ");
				for (int i = 0; i < node; i++) {
					// 꺼낸 노드와 i 노드가 간선으로 연결되어 있었으면
					// 즉, 인접행렬에 1씩 들어가 있었으면 진입 차수 빼주기
					if (adj[one][i] == 1) {
						indegree[i]--;
						// 1씩 뺐을 때 진입 차수가 0이 되면 큐에 넣어주기
						if (indegree[i] == 0)
							q.add(i);
					}
				}
			}
			System.out.println();
		} // tc
	}// main

}
