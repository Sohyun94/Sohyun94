package class2;

import java.util.Scanner;

public class B11650_좌표정렬_시간초과 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 점 개수
		int[] x = new int[N]; // x좌표 배열
		int[] y = new int[N]; // y좌표 배열
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt(); // x좌표 y 좌표 따로 받아 주기
		}
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < N-i; j++) {
				if(x[j] > x[j+1]) {
					int tmpX = x[j+1];
					x[j+1] = x[j];
					x[j] = tmpX;
					int tmpY = y[j+1];
					y[j+1] = y[j];
					y[j] = tmpY;
				} else if (x[j] == x[j+1] && y[j] > y[j+1]) {
					int tmpX = x[j+1];
					x[j+1] = x[j];
					x[j] = tmpX;
					int tmpY= y[j+1];
					y[j+1] = y[j];
					y[j] = tmpY;
				}
			}
		} // 정렬 끝
		for(int i = 0 ; i < N; i++) {
			System.out.println(x[i] + " " + y[i]);
		}
	}

}
