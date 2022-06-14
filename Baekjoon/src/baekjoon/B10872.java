package baekjoon;

import java.util.Scanner;

public class B10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		for(int i = 1; i <= N; i++) {
			a = a * i;
		}
		System.out.print(a);
	}

}
