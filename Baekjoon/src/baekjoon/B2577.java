package baekjoon;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num = A * B * C;
		String number = Integer.toString(num);
		
		for(int i = 0; i <= 9; i++) {
			int cnt = 0;
			for(int j = 0; j < number.length(); j++) {
				if((number.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
