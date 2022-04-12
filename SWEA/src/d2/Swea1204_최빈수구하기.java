package d2;

import java.util.Scanner;

public class Swea1204_최빈수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int tcN = sc.nextInt();
			int ans = 0;
			int max = -1;
			int[] stu = new int[1001];
			int[] score = new int[101];
			for (int i = 1; i <= 1000; i++) {
				stu[sc.nextInt()]++;
			} // 점수 입력받기
			for (int i = 1; i <= 100; i++) {
				if (max <= stu[i]) {
					max = stu[i];
					ans = i;
				}
			} // 최빈수 구하기
			System.out.println("#" + tcN + " " + ans);
		}

	}

}
