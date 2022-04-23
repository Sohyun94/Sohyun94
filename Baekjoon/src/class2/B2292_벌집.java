package class2;

import java.util.Scanner;

public class B2292_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 1;
		int room = 2;
		if (num == 1)
			System.out.println(ans); // 1번방이어도 시작지 방 포함이라 답 1
		else {
			while (num >= room) { // 방 개수가 입력 값 넘어서지 않을 때까지
				// 방 번호 + 6 * 방 개수만큼 증가
				room = room + (ans * 6);
				ans++;
			}
			System.out.println(ans);
		}
	}

}
