package twoDimenArr;

import java.util.Scanner;

public class C1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 세로
		int w = sc.nextInt(); // 가로
		int n = sc.nextInt(); // 막대 개수
		int[][] dim = new int[h][w]; // 좌표 평면
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt(); // 막대 길이
			int d = sc.nextInt(); // 막대 방향 -> 가로 : 0, 세로 : 1
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			for (int j = 0; j < l; j++) {
				if (d == 0) { // 방향이 가로
					dim[x][y + j] = 1;
				} else if (d == 1) {
					dim[x + j][y] = 1;
				}
			}//막대 놓기
		}//좌표 입력
		for(int i = 0; i < h; i++) {
			for(int j = 0 ; j < w; j++) {
				System.out.print(dim[i][j] + " ");
			}
			System.out.println();
		}
	}

}
