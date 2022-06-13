package class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B11651_좌표정렬2_시간초과 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 점 개수
		int N = sc.nextInt();
		// 좌표
		int[][] xy = new int[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				xy[i][j] = sc.nextInt();
			}
		} // 입력 끝

		// comparator
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			public int compare(int[] xy1, int[] xy2) {
				// 1. y 값 비교해서 같으면 x 값으로 비교
				if (xy1[1] == xy2[1])
					return xy1[0] - xy2[0];
				else
					return xy1[1] - xy2[1];
			}
		}); // 정렬 끝
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(xy[i][j] + " ");
			}
			System.out.println();
		}
	}

}
