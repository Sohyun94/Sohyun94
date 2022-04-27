package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15829_Hashing2 {
	public static final int mod = 1234567891;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine()); // 문자열 길이
		String s = br.readLine(); // 문자열 받기
		long num = 1; //31을 곱해주는.. 수..
		long sum = 0; // 수가 엄청 커질 수 있어서 long으로 받기
		for (int i = 0; i < len; i++) {
			sum += ((s.charAt(i) - 96) * num) % mod;
			num = (num * 31) % mod;
		}
		System.out.println(sum % mod);
	}
	// 모듈러 연산
	// (A + B) mod M = ((A mod M) + (B mod M) mod M
	// (A * B) mod M = ((A mod M) * (B mod M) mod M
	// 50점짜리였던 이유: 곱한 것만 저장하고 뒤늦게 연산하면 엄청 큰 숫자 저장됨..
	// long 쓸 상황을.. 제대로 알자.. 
	// 스캐너가 문제가 아니었다..

}
