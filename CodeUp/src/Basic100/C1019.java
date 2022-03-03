package Basic100;

import java.util.Scanner;

public class C1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열로 입력값 받기
		String s = sc.next();
		//문자열 잘라서 배열에 넣기
		// .을 기준으로 나눌 떄 [\]나 \\. 사용
		String[] st = s.split("\\.");
		//문자열 정수로 바꾸는 함수
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		int c = Integer.parseInt(st[2]);
		System.out.printf("%04d.%02d.%02d", a, b, c);
	}
}
