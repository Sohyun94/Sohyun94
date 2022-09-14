package greedy;

import java.util.Scanner;

public class B1543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		int cnt = 0;
		int idx = 0;

		for (int i = idx; i <= A.length() - B.length(); i++) {
			// 중복 단어 체크
			boolean repeat = true;
			for (int j = 0; j < B.length(); j++) {
				// 검색할 단어가 다를 경우
				if (A.charAt(i + j) != B.charAt(j)) {
					repeat = false;
					break;
				}
			}
			if (repeat) {
				// 같으면 세어 주기
				cnt++;
				// 인덱스는 문장만큼 이동
				idx += B.length();
				i = idx - 1;
			}

			// 단어가 다르면 다음 인덱스부터 탐색
			else
				idx++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
