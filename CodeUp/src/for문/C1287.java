package for문;

import java.util.Scanner;

public class C1287 {
	// 살짝 참고
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < i * n; j++) {
				System.out.print("*");
			}
			System.out.println(); //한 단 출력 끝날 때마다 줄 바꿔주기
		}

	}

}
