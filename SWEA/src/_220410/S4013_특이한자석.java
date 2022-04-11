package _220410;

import java.util.Scanner;

public class S4013_특이한자석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // tc
		for (int tc = 1; tc <= T; tc++) {
			int count = sc.nextInt(); // 회전 횟수
			int[][] plate = new int[4][8]; // 4개의 자석, 8개의 톱날
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 8; j++) {
					plate[i][j] = sc.nextInt(); // 판에 놓인 자석과 날 정보
				}
			}// 판 정보
			for(int i = 0; i < count; i++) {
				int rotation = sc.nextInt();
				int direction = sc.nextInt();
				
				//다시 풀기
			}
		} // tc

	}// main

}
