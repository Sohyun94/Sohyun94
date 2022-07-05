package ch3;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 숫자 개수
		char[] num = new char[N]; // 숫자 담을 char 배열
		num = sc.next().toCharArray(); // 숫자 담아서 잘라 주기
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i] - '0'; // 정수형으로 바꿔주기
		}
		System.out.println(sum);

	}

}
