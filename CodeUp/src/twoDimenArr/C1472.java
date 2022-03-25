package twoDimenArr;

import java.util.Scanner;

public class C1472 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 열 수
		int m = sc.nextInt(); // 행 수
		int arr[][] = new int[n][m];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) {
					arr[n - 1 - i][m - 1 - j] = cnt++;
				} else if (i % 2 != 0) {
					arr[n - 1 - i][j] = cnt++;
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
