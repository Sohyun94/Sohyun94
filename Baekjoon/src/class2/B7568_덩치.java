package class2;

// 쓸데없이 어려운 길을 돌아갔다..
// 좀 더 효율적으로 문제 푸는 방법을 궁리해 봐야 할 것 같다.
// 나는 rank를 N으로 설정하고 거기서 빼는 방식을 생각했는데
// 그게 조건절로 걸어 줄 게 많아서 좀 더 곤란했다
// 아마 그렇게도 풀 수 있을 것 같은데 다음에 다시 풀어봐야겠다
import java.util.Scanner;

public class B7568_덩치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사람 수

		int[][] big = new int[N][2]; // 덩치 받아 줄 배열
		// 각 행마다 키, 몸무게를 받는다

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++)
				big[i][j] = sc.nextInt();
		} // 입력 완료

		// 덩치 비교
		for (int i = 0; i < N; i++) {
			// 매 반복문 돌 때마다 랭크 1로 초기화 해주기
			int rank = 1;
			for (int j = 0; j < N; j++) {
				// 자기 자신을 비교할 필요 없어서 넘겨줌
				if (i == j)
					continue;
				// 앞사람보다 키, 몸무게 모두 작으면
				// 등수 아래로 내려주기
				if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
					rank++;
				}

			}
			System.out.print(rank + " ");
		}
	}
}
