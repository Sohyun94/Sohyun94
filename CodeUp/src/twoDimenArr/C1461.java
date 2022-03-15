package twoDimenArr;

import java.util.Scanner;

public class C1461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			for (int j = 0 ; j < l; j++) {
				arr[i][l-1-j] += num;
				num++;
			}
		}
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
