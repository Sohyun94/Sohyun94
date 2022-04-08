package class1;

import java.util.Scanner;

public class B2439_별찍기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i + j >= N - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}
}
