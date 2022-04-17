import java.util.Scanner;

public class Swea_장훈이선반3 {
	static int N, B, ans; // N : 점원의 수, B: 선반의 높이, ans: 정답
	static int[] H;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();

			H = new int[N]; // 점원의 키 입력
			int total = 0;
			for (int i = 0; i < N; i++) {
				H[i] = sc.nextInt();
				total += H[i];
			}
			ans = Integer.MAX_VALUE;
			find(0, 0, total);

			System.out.println("#" + tc + " " + ans);

		} // tc

	}// main

	// idx : 점원 인덱스, sum : 중간 합
	private static void find(int idx, int sum, int restSum) {
		if (idx == N) {
			if (sum >= B && ans > sum - B) {
				ans = sum - B;
			}
			if (sum + restSum < B)
				return;

			find(idx + 1, sum + H[idx], restSum - H[idx]); // 해당 점원 뽑고 가기
			find(idx + 1, sum, restSum - H[idx]); // 해당 점원 안 뽑고 가기
		}
	}

}
