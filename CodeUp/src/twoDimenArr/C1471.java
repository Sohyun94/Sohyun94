package twoDimenArr;

import java.util.Scanner;

public class C1471 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		int arr[][] = new int[n][n];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j % 2 == 0) {
					arr[n - i - 1][j] = cnt++;
				} else if (j % 2 != 0) {
					arr[i][j] = cnt++;
				}
			}
		}//for문
		for(int i = 0; i <n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
