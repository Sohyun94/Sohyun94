package class2;

import java.util.Scanner;

public class B10250_ACM호텔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			int floor = sc.nextInt(); // 층 수
			int room = sc.nextInt(); // 층마다 방 수
			int num = sc.nextInt(); // 손님 순서
			int ans = 0;
			if (num % floor != 0) {
				ans = (num % floor) * 100 + (num / floor) + 1;
			} else {
				ans = (floor * 100) + num / floor;
			}
			System.out.println(ans);
		}
	}

}
