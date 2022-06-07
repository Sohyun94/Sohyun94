package class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B11650_좌표정렬_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 점 개수
		int[][] xy = new int[N][2]; // 좌표 담아줄 2차원 배열
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				xy[i][j] = sc.nextInt();
			}
		}
		// comparator 사용
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] x1, int[] x2) {
				// x값 비교해서 같으면 y 값으로 비교
				if (x1[0] == x2[0]) {
					return x1[1] - x2[1];
					// x값 비교해서 더 크면 빼준 값 리턴
					// (오름차순 정렬)
				} else {
					return x1[0] - x2[0];
				}
			}
		});
		// 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(xy[i][j] + " ");
			}
			System.out.println();
		}
	}

}
