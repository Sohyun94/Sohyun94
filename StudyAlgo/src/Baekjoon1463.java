import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1463 {
	static Integer[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		dp = new Integer[X + 1];
		dp[0] = dp[1] = 0;

		System.out.println(recur(X));
	}

	private static int recur(int x) {
		if (dp[x] == null) {
			// 6으로 나누어 떨어짐
			if (x % 6 == 0)
				// 3으로 나누는 경우, 2로 나누는 경우, 1 빼는 경우 전부 고려
				// 무조건 연산을 한 번은 하게 되니까 최솟값 +1
				dp[x] = Math.min(recur(x - 1), Math.min(recur(x / 3), recur(x / 2))) + 1;
			// 3으로 나누어 떨어짐
			// 1 뺄 때랑 비교하여 최솟값
			else if (x % 3 == 0)
				dp[x] = Math.min(recur(x / 3), recur(x - 1)) + 1;
			// 2로 나누어 떨어짐
			// 1 뺄 때랑 비교화여 최솟값
			else if (x % 2 == 0)
				dp[x] = Math.min(recur(x / 2), recur(x - 1)) + 1;
			else
				dp[x] = recur(x - 1) + 1;
		}
		return dp[x];

	}
}
