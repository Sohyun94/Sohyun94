package 시험공부;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj_11275_트리의부모찾기 {
	static int N;
	static ArrayList<Integer>[] list;
	static int[] parent;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		list = new ArrayList[N + 1];
		parent = new int[N + 1];
		visited = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			list[a].add(b);
			list[b].add(a);
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i);
			}
		}
		for (int i = 2; i <= N; i++) {
			System.out.println(parent[i]);
		}

	}

	private static void dfs(int node) {
		if (visited[node]) {
			return;
		}
		visited[node] = true;
		for (int n : list[node]) {
			if (!visited[n]) {
				parent[n] = node;
				dfs(n);
			}

		}

	}

}