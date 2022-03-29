package twoDimenArr;

import java.util.Scanner;

public class C1492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			arr[i] = sum;
		} // for문
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
