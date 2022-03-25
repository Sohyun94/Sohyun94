package twoDimenArr;

import java.util.Scanner;

public class C1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 1;
		int arr[][] = new int[n][m];
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if (j % 2 == 0) {
					arr[i][m - 1 - j] = cnt++;
				} else if (j % 2 != 0) {
					arr[n - 1 - i][m - 1 - j] = cnt++;
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
