package _220405;
import java.util.Scanner;

public class B3040_백설공주와일곱난쟁이 {
	static int[] num = new int[9]; // 난쟁이 번호 받을 배열
	static int[] real = new int[7]; // 진짜 난쟁이 담을 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		} // 번호 담기
		find(0, 0);
	}// main

	public static void find(int cnt, int first) {
		if (cnt == 7) { // 7명까지 셌으면 합계 0으로 초기화
			int sum = 0;
			for (int i = 0; i < 7; i++) {
				sum += real[i]; // 합계는 7명까지 번호 다 더한게 됨
			}
			if (sum == 100) { // 합계가 100이면 그게 7명 난쟁이 조합
				for (int i = 0; i < 7; i++) {
					System.out.println(real[i]);
				}
			}
			return;
		}
		for (int i = first; i < 9; i++) {
			real[cnt] = num[i]; // 이 경우 num[0] ~ [9]까지 찐 난쟁이 조합이니까
			find(cnt + 1, i + 1);
		}
	}
}