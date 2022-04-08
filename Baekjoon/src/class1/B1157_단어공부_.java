package class1;

import java.util.Scanner;

public class B1157_단어공부_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = Integer.MIN_VALUE;
		char ans = '?';
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 65]++;
			} else {
				arr[s.charAt(i) - 97]++;
			}
		} // 인덱스 늘리기 끝
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ans = (char) (i + 65); // 대문자로 출력해야 하므로
			} else if (arr[i] == max) {
				ans = '?';
			}
		}
		System.out.println(ans);
	} // main

}
