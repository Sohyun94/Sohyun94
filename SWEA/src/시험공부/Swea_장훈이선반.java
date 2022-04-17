import java.util.Scanner;

public class Swea_장훈이선반 {
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

			// 모든 경우의 수 구하기
			for (int i = 1; i < (1 << N); i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					if ((i & 1 << j) != 0)
						sum += H[j];
				}
				// 이번에 만든 탑의 높이가 선반보다 높으면서 정답보다 낮을 때
				if (sum >= B && sum < ans)
					ans = sum;
			}
			System.out.println("#" + tc + " " + (ans - B));

		}//tc

	}//main

}
