package Basic100;

import java.util.Scanner;

public class C1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble(); //가로 해상도
		double h = sc.nextDouble(); //세로 해상도
		double b = sc.nextDouble(); //픽셀 저장하는 비트
		double ans = (w*h*b) / (1024 * 1024 * 8);
		System.out.printf("%.2f MB", ans);
	}
}
