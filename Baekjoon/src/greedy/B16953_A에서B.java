package greedy;

import java.util.Scanner;

public class B16953_A에서B {
	// 10의 9승이기 때문에 long으로 선언
	static long A, B, ans;
	// A가 B로 바뀌었는지 판별
	static boolean isB;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		dfs(A, 1);
		if (isB)
			System.out.println(ans);
		else
			System.out.println(-1);
	}

	private static void dfs(long tmp, int cnt) {
		if (tmp > B)
			return;
		else if (tmp == B) {
			ans = cnt;
			isB = true;
			return;
		}
		dfs(tmp * 2, cnt + 1);
		dfs(10 * tmp + 1, cnt + 1);
	}

}
