package baekjoon;

import java.util.Scanner;

public class B2839_설탕배달 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		while (true) {
			if (n % 5 == 0) {
				count += n / 5;
				break;
			}
			n -= 3;
			count++;
			if (n < 0) {
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}
}