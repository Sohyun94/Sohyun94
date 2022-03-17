package twoDimenArr;

import java.util.Scanner;

public class C1466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int num = 1;
		int rl = arr.length;
		int cl = arr[0].length;
		for (int j = cl - 1; j >= 0; j--) {
			for (int i = rl - 1; i >= 0; i--) {
				arr[i][j] = num++;
			}
		} // for문
		for (int i = 0; i < rl; i++) {
			for (int j = 0; j < cl; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}// main

}
