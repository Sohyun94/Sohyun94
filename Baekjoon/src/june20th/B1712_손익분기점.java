package june20th;

import java.util.Scanner;

public class B1712_손익분기점 {
	
	// 이게 뭐라고 갑자기 for문을 쓰려다가 엉뚱한 길로 샜다

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 고정 비용
		int B = sc.nextInt();// 가변 비용
		int C = sc.nextInt(); // 노트북 비용
		int ans = 0; // 답
		if (B >= C)
			System.out.println(-1);
		else {
	// 생각해 보니 나머지가 0이어도 수익이 있으려면 그보다 커야 되니까 몫에 무조건 1 더해주기
//			if (A % (C - B) == 0)
//				System.out.println(A / (C - B));
//			else
				System.out.println(A / (C - B) + 1);
		}
	}
}
