package 시험공부;


import java.util.Scanner;

public class B15649_N과M1 {
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 자연수
		int M = sc.nextInt(); // 수열 길이 (M개 고름)
		arr = new int[M];
		visited = new boolean[N];
		perm(N, M, 0);

	}

	static void perm(int N, int M, int idx) {
		if (idx == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[idx] = i + 1;
				perm(N, M, idx + 1);
				visited[i] = false;
			}
		}

	}

}
