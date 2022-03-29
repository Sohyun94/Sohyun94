package _220328;

import java.util.Scanner;

public class B1463_1로만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 정수 받기
		int cnt = 0; // 카운트 변수
		if (X % 3 == 0) {
			X /= 3;
			cnt++;
		} else if (X % 2 == 0) {
			X /= 2;
			cnt++;
		} else if (X != 1) {
			X -= 1;
			cnt++;
		} else if(X == 1) {
			cnt = 0;
		}
		System.out.println(cnt);
	}

}
