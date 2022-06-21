package june20th;

import java.util.Scanner;

public class B1316_그룹단어체커2_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 단어 총 개수
		int ans = 0; // 정답

		for (int tc = 0; tc < T; tc++) {

			// 문자열 받기
			String str = sc.next();

			// 이미 앞에 나온 알파벳인지 확인할 배열
			boolean[] used = new boolean[26];

			// 그룹 단어인지 확인
			boolean check = true;

			for (int i = 0; i < str.length(); i++) {
				int idx = str.charAt(i) - 'a';
				// 앞에서 쓴 알파벳인지 확인
				if (used[idx]) {
					// 그런데 다른 알파벳임 (연속 안 되면)
					if (str.charAt(i) != str.charAt(i - 1)) {
						// 그룹 단어 아님
						check = false;
						break;
					}
					// 앞에서 쓴 게 아니라면
				} else {
					// 문자 사용 true로 바꿔 주기
					used[idx] = true;
				}
			}
			// 그룹 단어라면
			if (check)
				ans++;
		} // main
		System.out.println(ans);
	}
}
