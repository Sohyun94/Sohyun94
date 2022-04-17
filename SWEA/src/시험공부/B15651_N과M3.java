package 시험공부;


import java.util.Scanner;

public class B15651_N과M3 {
	static int[] arr;
	static int N, M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 자연수
		M = sc.nextInt(); // 수열 길이 (M개 고름)
		arr = new int[M];
		dfs(0);
		System.out.print(sb);
	}

	static void dfs(int idx) {
		if (idx == M) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			arr[idx] = i;
			dfs(idx +1);
		}

	}

}
