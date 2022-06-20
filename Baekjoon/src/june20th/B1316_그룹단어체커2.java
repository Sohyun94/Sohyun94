package june20th;

import java.util.Scanner;

public class B1316_그룹단어체커2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 단어 총 개수
		int ans = 0; // 정답
		for (int tc = 0; tc < T; tc++) {
			// 문자열 받기
			String str = sc.next();
			// 문자열 한 글자씩 나눠서 받아줄 배열
			char[] sArr = new char[str.length()];
			// 문자열 배열로 나누기
			for (int i = 0; i < str.length(); i++) {
				sArr[i] = str.charAt(i);
			}
			// 카운트
			int cnt = 0;

			outer: for (int i = 0; i < str.length() - 1; i++) {
				for (int j = 0; j < str.length() - 1 - i; j++) {
//					if (sArr[j] != sArr[j + 1]) {
//						continue;
//					} else {
					if (sArr[i] == sArr[i + 1] && sArr[j] == sArr[i + 1] || sArr[i] != sArr[i + 1] && sArr[j] == sArr[i]) {
						cnt = 1;
						break outer;
						// }
					}
				}
			} // for문
			if (cnt == 0)
				ans++;
		} // main
		System.out.println(ans);
	}
}
