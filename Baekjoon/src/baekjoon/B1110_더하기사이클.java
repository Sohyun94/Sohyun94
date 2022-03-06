package baekjoon;

import java.util.Scanner;

public class B1110_더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //입력 숫자
		int x = n; // n 저장
		int count = 0; // 반복 횟수
		while (true) {
			int a = x / 10 ; //a는 N의 10의 자리 숫자
			int b = x % 10 ; //b는 N의 1의 자리 숫자
			//자릿수와 무관하게 숫자만 합함
			int sum = a + b;
			//기존 수의 1의 자리 숫자 -> 10의 자리 숫자
			//합한 수의 오른쪽 숫자(1의 자리 숫자)가 1의 자리 숫자가 되므로 나누기 10
			x = b*10 + sum % 10;
			count++;
			
			if (x == n) {
				break;
			}
		}
		System.out.println(count);

	}

}
