package twoDimenArr;

import java.util.Scanner;

public class C1473 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 1;
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) {
					arr[n - 1 - i][j] = cnt++;
				} else if (i % 2 != 0) {
					arr[n - 1 - i][m - 1 - j] = cnt++;
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
