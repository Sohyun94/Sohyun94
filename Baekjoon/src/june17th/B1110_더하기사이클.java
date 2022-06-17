package june17th;

import java.util.Scanner;

public class B1110_더하기사이클 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정수 입력
		
		// N이 10보다 작다면 두 자리 수 만들기
		if (N < 10)
			N = N * 10;

		// 연산에 쓸 변수 x
		// 초기 값은 입력 값인 N과 같다
		int x = N;
		
		// 정답
		int cnt = 0;
		
		// 연산 시작
		while (true) {
			// a는 x의 10의 자리 숫자
			int a = x / 10;
			// b는 x의 1의 자리 숫자니까 나머지 연산
			int b = x % 10;
			// 더하기 사이클 계산
			x = b * 10 + (a + b) % 10;
			// 연산 끝나면 1씩 더해주기
			cnt++;
			// 연산 결과가 초기 입력 값인 N과 같다면 연산 종료
			if (x == N)
				break;
		}
		System.out.println(cnt);
	}
}
