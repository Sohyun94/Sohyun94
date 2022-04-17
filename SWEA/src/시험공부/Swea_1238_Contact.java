import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Swea_1238_Contact {
	static int N, start, ans; // 데이터의 길이, 시작 당번, 정답
	static int[][] adj; // 인접 행렬
	static boolean[] visited; // 방문 처리

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			N = sc.nextInt();
			start = sc.nextInt();

			adj = new int[101][101]; // 최대 번호 100번
			visited = new boolean[101];

			// N개의 데이터가 들어옴
			for (int i = 0; i < N; i += 2) {
				// int st = sc.nextInt();
				// int ed = sc.nextInt();
				adj[sc.nextInt()][sc.nextInt()] = 1;
			}

			Queue<Integer> q = new LinkedList<Integer>();
			q.add(start);
			visited[start] = true;

			while (!q.isEmpty()) {
				int size = q.size();
				// 마지막 깊이에서의 최댓값 필요하므로 갱신
				ans = 0;

				for (int i = 0; i < size; i++) {
					int curr = q.poll();
					if (ans < curr)
						ans = curr;
					for(int j = 0; j < 101; j++) {
						if(!visited[j] && adj[curr][j] == 1)
							q.add(j);
						visited[j] = true;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main

}
