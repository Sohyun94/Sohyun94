package twoDimenArr;

import java.util.Scanner;

public class C1464 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;
		int arr[][] = new int[n][m];
		int rl = arr.length;
		int cl = arr[0].length;
		for (int i = rl - 1; i >= 0; i--) {
			for (int j = 0; j < cl; j++) {
				arr[i][cl - 1 - j] = num++;
			}
		} // 배열 채우기
		for (int i = 0; i < rl; i++) {
			for (int j = 0; j < cl; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
