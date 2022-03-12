package for문;

import java.util.Scanner;

public class C1296 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
