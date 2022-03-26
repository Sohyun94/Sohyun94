package twoDimenArr;

import java.util.Scanner;

public class C1478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		int cnt = 1;
		for (int k = 0; k <= n + m - 2; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = m - 1; j >= 0; j--) {
					if (i + m - 1 - j == k) {
						arr[i][j] = cnt++;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
