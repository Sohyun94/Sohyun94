package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1049_기타줄 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt(); // 끊어진 줄 개수
		int brand = sc.nextInt(); // 브랜드 종류
		int[] set = new int[brand]; // 세트 배열
		int[] single = new int[brand]; // 싱글 배열
		for (int i = 0; i < brand; i++) {
			set[i] = sc.nextInt();
			single[i] = sc.nextInt();
		}
		// 오름차순 정렬
		Arrays.sort(set);
		Arrays.sort(single);

		int ans = 0; // 최솟값
		int minA = 0;
		int minB = 0;
		int minC = 0;
		if (line <= 6) {
			ans = Math.min(set[0], single[0]*line);
			System.out.println(ans);
		} else {
			if (line % 6 == 0) {
				minA = set[0] * ((line / 6) - 1) + single[0] * 6;
				minB = set[0] * (line / 6);
				minC = single[0] * line;
				ans = Math.min(Math.min(minA, minB), minC);
				System.out.println(ans);
			} else {
				minA = set[0] * (line / 6) + single[0] * (line % 6);
				minB = set[0] * ((line / 6) + 1);
				minC = single[0] * line;
				ans = Math.min(Math.min(minA, minB), minC);
				System.out.println(ans);
			}
		}

	}
}