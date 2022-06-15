package baekjoon;

import java.util.Scanner;

public class B9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0 ; tc < T; tc++) {
			String str = sc.next();
			char start = str.charAt(0);
			char end = str.charAt(str.length()-1);
			System.out.print(start);
			System.out.println(end);
		}
	}
}
