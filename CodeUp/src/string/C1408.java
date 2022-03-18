package string;

import java.util.Scanner;

public class C1408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();
		char[] pwA = new char[pw.length()];
		for (int i = 0; i < pw.length(); i++) {
			pwA[i] = pw.charAt(i);
		}
		for (int i = 0; i < pw.length(); i++) {
			System.out.print((char) (pwA[i] + 2));
		}
		System.out.println();
		for(int i = 0 ; i < pw.length(); i++) {
			System.out.print((char) (pwA[i] * 7 % 80 + 40));
		}

	}

}
