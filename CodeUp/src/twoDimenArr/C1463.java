package twoDimenArr;

import java.util.Scanner;

public class C1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[n-1-j][i] = num++;
			}
		}//for문
		for(int i = 0; i < n; i++) {
			for(int j =0; j <n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}//main

}
