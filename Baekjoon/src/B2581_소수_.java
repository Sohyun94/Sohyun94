import java.util.Scanner;

public class B2581_소수_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int min = 10001;
		int sum = 0;

		for (int i = M; i <= N; i++) {
			// 소수 판별할 변수 (true면 소수)
			boolean flag = true;
			// 1은 소수가 아니므로
			if (i == 1)
				flag = false;
			// 소수 판별, 나누어 떨이지면 소수가 아님
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				// 최솟값 구하기
				if (min > i)
					min = i;
				// 합도 구해 주기
				sum += i;
			}
		} // 소수 판별 끝

		// 합계가 0이면 소수가 없는 거니까 -1 출력
		if (sum == 0)
			System.out.println(-1);
		else
			System.out.print(sum + "\n" + min);
	}

}
