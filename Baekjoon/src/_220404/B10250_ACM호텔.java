package _220404;

import java.util.Scanner;

public class B10250_ACM호텔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int h = sc.nextInt(); // 높이
			int w = sc.nextInt(); // 폭
			int num = sc.nextInt(); // 손님 수(몇 번째 손님인지)
			int floor = num % h; // 층수 = 손님 수 % 높이
			int room = num / h + 1;
			if (num % h == 0) { // 이 경우 0층이 되므로
				room = num / h; // 방 = 손님 수 / 높이
				floor = h; // 층은 그냥 높이
			}
			System.out.println(floor * 100 + room);

		}
	}

}
