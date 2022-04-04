package _220404;

import java.util.Scanner;

public class B1018_체스판새로칠하기2 {
	static char[][] chess; // 체스판
	static int N; // 세로
	static int M; // 가로

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		chess = new char[N][M];
		int ans = Integer.MAX_VALUE; // 정답(최솟값 구할 거니 maxValue로 초기화)

		sc.nextLine(); // 개행 날리기
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine(); //한 줄씩 받기
			for (int j = 0; j < M; j++) {
				chess[i][j] = line.charAt(j); //한 글자씩 체스판에 잘라서 넣기
			}
		} // 체스판 입력받기
		for (int i = 0; i < N - 7; i++) { // 8*8칸 돌며 탐색
			for (int j = 0; j < M - 7; j++) {
				ans = Math.min(ans, paint(i, j));
			}
		}//메서드 적용
		System.out.println(ans);
	}// main

	public static int paint(int c, int r) {
		// 두 가지 경우로 나뉨
		// 1. 맨 위쪽 칸 흰색일 때 2. 맨 위쪽 칸 검은색일 때
		int cntWhite = 0; // 흰색일 때 수
		int cntBlack = 0; // 검은색일 때 수
		// 1의 경우	
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		
		// 2의 경우
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		// [B W B W B W B W]
		// [W B W B W B W B]
		
		// 이렇게 전개되는데 이에 맞춰 해당 칸을 비교해서 색칠한다고 생각하면 된다
		// 예) W가 나와야 하는데 입력받은 값에서 B으로 되어 있으면 바꿔야 함
		// 그것이 아래 메서드

		for (int i = c; i < c + 8; i++) {
			for (int j = r; j < r + 8; j++) {
				if ((i + j) % 2 == 0) {
					if (chess[i][j] == 'W')
						cntWhite++;
					else
						cntBlack++;
				} else {
					if (chess[i][j] == 'B')
						cntWhite++;
					else
						cntBlack++;
				}
			}
		}
		return Math.min(cntWhite, cntBlack); // 최솟값 반환
	}
}
