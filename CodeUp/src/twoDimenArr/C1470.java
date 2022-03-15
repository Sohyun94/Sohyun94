package twoDimenArr;

import java.util.Scanner;

public class C1470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int len = arr.length;
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					arr[j][i] = num++;
				} else
					arr[n - 1 - j][i] = num++;
			}
		} // 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
