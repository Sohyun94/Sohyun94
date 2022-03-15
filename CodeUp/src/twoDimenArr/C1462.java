package twoDimenArr;

import java.util.Scanner;

public class C1462 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int len = arr.length;
		int num = 1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				arr[j][i] = num++;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
