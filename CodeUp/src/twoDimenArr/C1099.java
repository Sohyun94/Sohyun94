package twoDimenArr;

import java.util.Scanner;

public class C1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		} // 맵 입력
		int x = 1;
		int y = 1; // 개미 좌표 설정
		for (int i = x; i < arr.length; i++) {
			for (int j = y; j < arr.length; j++) {
				if (arr[x][y + 1] == 0) {
					arr[x][y] = 9;
					y++;
				} else if (arr[x][y + 1] == 1) {
					arr[x][y] = 9;
					y--;
					x++;
				} else if (arr[x][y] == 2) {
					arr[x][y] = 9;
					break;
				}
			}
		} // 개미 이동 끝
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}// main

}
