package baekjoon;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 대소문자 구분 없으므로 해당 단어 대문자로 바꾸기
		String a = sc.next().toUpperCase();
		// 알파벳이 총 26개이므로 배열도 26개
		int[] arr = new int[26];
		int max = 0;
		char result = ' ';
		for (int i = 0; i < a.length(); i++) {
			// 문자열 index에서 아스키코드 A(65)를 빼기
			int idx = a.charAt(i) - 'A';
			// 배열 인덱스 카운트
			arr[idx]++;
		}
		// 배열에 저장된 알파벳이 사용된 개수 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
		//대문자로 출력해야 하므로 i번째에서 다시 A를 더하고 char로 형변환
				result = (char) (i+'A');
			} else if (arr[i] == max) {
				result = '?';
			}

		}
		System.out.println(result);
	}

}
