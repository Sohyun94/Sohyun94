package _220328;

import java.util.Arrays;
import java.util.Scanner;

public class B2805_나무자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int treeN = sc.nextInt(); // 나무 숫자
		int treeL = sc.nextInt(); // 나무 길이
		long[] treeH = new long[treeN]; // 나무들 담을 배열

		for (int i = 0; i < treeN; i++) {
			treeH[i] = sc.nextLong(); // 가져가려는 나무들 높이 담기
		}
		Arrays.sort(treeH); // 길이 정렬

		long min = 0; // 최소
		long max = treeH[treeN - 1]; // 최대

		while (min <= max) {
			long middle = (max + min) / 2; // 중간값 구하기
			long sum = 0; // 합계
			for (long tree : treeH) {
				if (tree > middle) { // 나무 길이 중 뽑은 나무가 중간값보다 크면
					sum += tree - middle; // 차이를 더해 가는 게 합계
				}
			}
			if (sum >= treeL) { // 합계가 나무 길이보다 커지면
				min = middle + 1;
			} else {
				max = middle - 1;
			}
		}
		System.out.println(max);
	}// main

}
