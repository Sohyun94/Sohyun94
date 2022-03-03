package Basic100;

import java.util.Scanner;

public class C1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[24];
		for (int i = 1; i <= n; i++) {
			arr[sc.nextInt()]++;
		}
		for (int i = 1; i <= 23; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
