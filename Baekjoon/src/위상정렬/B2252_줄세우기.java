package 위상정렬;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2252_줄세우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] in = new int[32001];

		ArrayList<Integer>[] out = new ArrayList[32001];
		for(int i = 1; i <= N; i++)
			out[i] = new ArrayList<>();
			
		for (int i = 0; i < M; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();

			in[second] += 1;
			out[first].add(second);

		}
		Queue<Integer> que = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			if (in[i] == 0)
				que.add(i);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (!que.isEmpty()) {
			int now = que.poll();
			ans.add(now);

			for (int i = 0; i < out[now].size(); i++) {
				int next = out[now].get(i);
				in[next] -= 1;
				if (in[next] == 0)
					que.add(next);
			}
		}

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
}
