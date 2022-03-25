package twoDimenArr;

import java.util.Scanner;

public class C1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 1;
		int[][] arr = new int[n][m];
		for (int k = 0; k <= n + m - 2; k++) {
			for (int j = 0; j < m; j++) {
				for (int i = 0; i < n; i++) {
					if (i + j == k) {
						arr[i][j] = cnt++;
						break;
					}
				}
			}

		} // 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
