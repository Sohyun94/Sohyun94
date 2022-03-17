package twoDimenArr;

import java.util.Scanner;

public class C1469 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;
		int num2 = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					arr[i][n - 1 - j] = num++;
				} else if (i % 2 != 0) {
					arr[i][j] = num++;
				}
			}
		} // 배열 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
