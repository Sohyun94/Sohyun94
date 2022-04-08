package class1;

import java.util.Scanner;

public class B10950_A더하기B_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			System.out.println(C);
		}

	}

}
