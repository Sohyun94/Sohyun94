package 시험공부;

import java.util.Scanner;

public class Swea_1231_중위순회 {
	static int N; // 노드 수
	static char[] tree; // 트리 배열
	static String ans; // 정답

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			N = sc.nextInt();
			tree = new char[N + 1];
			ans = "";
			for (int i = 1; i <= N; i++) {
				String[] str = sc.nextLine().split(" ");
				tree[i] = str[1].charAt(i);
			}
			arrange(1);
			System.out.println("#" + tc + " " + ans);
		} // tc

	}

	private static void arrange(int node) {
		if (node > N)
			return;
		arrange(node * 2);
		ans += tree[node];
		arrange(node * 2 + 1);

	} // main

}
