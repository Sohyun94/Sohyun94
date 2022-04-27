package class2;

import java.util.Scanner;

public class B15829_Hashing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt(); // 문자열 길이
		String s = sc.next(); // 문자열 받기
		long sum = 0; // 수가 엄청 커질 수 있어서 long으로 받기
		long ans = 0;
		for (int i = 0; i < len; i++) {
			sum += (s.charAt(i) - 96) * Math.pow(31, i);
		}
		ans = sum % 1234567891;
		System.out.println(ans);
	}
	//50점짜리 답안이다 ^^
	
	

}
