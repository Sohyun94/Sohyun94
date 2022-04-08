package class1;

import java.util.Scanner;

public class B2675_문자열반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			char [] c = sc.next().toCharArray();
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(c[i]);
				}
			}
			System.out.println();
		}

	}

}
