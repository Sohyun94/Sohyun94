package twoDimenArr;

import java.util.Scanner;

public class C1460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		// 참고
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					arr[i][j] += num;
					System.out.print(arr[i][j] + " ");
					num++;
				}
			System.out.println();
			}
		}

	}

