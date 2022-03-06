package baekjoon;

import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		// trim: 앞뒤 공백 제거
		a = a.trim();
		// 앞뒤 공백 제거된 문자열 사이를 split을 이용해 공백 기준으로 나누기
		String[] arr = a.split(" ");
		int cnt = 0;
		// 문자열 세기
		for (int i = 0; i < arr.length; i++) {
		//문자열이 비어 있지 않을 경우에 카운팅
			if (arr[i] != "") {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
