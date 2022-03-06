package baekjoon;

import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		int result;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i] * arr[i];
		}
		result = sum % 10;
		System.out.println(result);
	}

}