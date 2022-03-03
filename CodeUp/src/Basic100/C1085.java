package Basic100;

import java.util.Scanner;

public class C1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextInt(); // 마이크로 소리강약 체크, 헤르쯔
		double b = sc.nextInt(); // 비트
		double c = sc.nextInt(); // 채널
		double s = sc.nextInt(); // 녹음 횟수
		double ans = (h * b * c * s) / (8 * 1024 * 1024);
		System.out.printf("%.1f MB", ans);
	}

}
