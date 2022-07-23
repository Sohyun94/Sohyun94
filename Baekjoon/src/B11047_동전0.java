import java.util.Scanner;

public class B11047_동전0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 동전 종류
		int K = sc.nextInt(); // 만들려는 값
		int[] coin = new int[N]; // 동전 개수 담을 배열
		int ans = 0; // 정답
		for (int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
		for (int i = N - 1; i >= 0; i--) {
			if (coin[i] > K)
				continue;
			else if (coin[i] <= K) {
				K = K - coin[i];
				ans++;
				i = i + 1;
			}
		}
		System.out.println(ans);

	}

}
