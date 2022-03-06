package baekjoon;

import java.util.Scanner;

public class B2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 달팽이가 기어올라가는 높이
		int B = sc.nextInt(); // 달팽이가 미끄러지는 거리
		int V = sc.nextInt(); // 나무 막대 길이
		int day = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0) {
			System.out.println(day + 1);
		} else {
			System.out.println(day);
		}
	}
}
