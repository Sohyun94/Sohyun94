package 중첩반복문;

import java.util.Scanner;

public class C1378 {

	public static void main(String[] args) {
		// 풀이 참고
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) { //합을 i회 반복
				sum += j;
			}
		}
		System.out.println(sum);
	}

}
