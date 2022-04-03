package twoDimenArr;

import java.util.Scanner;

public class C1493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] arr2 = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k <= i; k++) {
					for (int l = 0; l <= j; l++) {
						sum += arr[k][l];
					}
				}
				arr2[i][j] = sum;
				sum = 0;
			}
		} // 합 끝
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
