package d1;

import java.util.Scanner;

public class Swea2019_더블더블 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		for (int i = 0; i <= N; i++) {
			System.out.print(a + " ");
			a *= 2;
		}

	}

}
