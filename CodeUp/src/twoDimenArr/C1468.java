package twoDimenArr;

import java.util.Scanner;

public class C1468 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					arr[i][j] = num++;
				} else if (i % 2 != 0)
					arr[i][n - j - 1] = num++;
			}
		} // for문 끝
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}// main

}
