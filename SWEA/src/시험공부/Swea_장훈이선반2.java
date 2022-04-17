import java.util.Scanner;

public class Swea_장훈이선반2 {
	static int N, B, ans; // N : 점원의 수, B: 선반의 높이, ans: 정답
	static int[] H;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();

			H = new int[N]; // 점원의 키 입력
			for (int i = 0; i < N; i++) {
				H[i] = sc.nextInt();
			}
			ans = Integer.MAX_VALUE;
			find(0, 0);

			System.out.println("#" + tc + " " + ans);

		} // tc

	}// main

	// idx : 점원 인덱스, sum : 중간 합
	private static void find(int idx, int sum) {
		if (idx == N) {
			if (sum >= B && ans > sum - B) {
				ans = sum;
			}
			find(idx + 1, sum + H[idx]); // 해당 점원 뽑고 가기
			find(idx + 1, sum); // 해당 점원 안 뽑고 가기
		}
	}

}
