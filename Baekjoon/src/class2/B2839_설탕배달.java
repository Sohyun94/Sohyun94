package class2;

import java.util.Scanner;

public class B2839_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		// if에 비해 while문 활용도가 낮은 듯..?
		// while문 쓰는 연습을 자주 해야겠당
		while (N > 0) {
			// 5로 나누어 떨어지면 그냥 나눠주기
			if (N % 5 == 0) {
				N -= 5;
				ans++;
				// 아니면 3으로 나눠주고 N에서 3씩 빼주기
			} else {
				N -= 3;
				ans++;
			}
		}
		if (N == 0)
			System.out.println(ans);
		else
			System.out.println(-1);
	}
}
