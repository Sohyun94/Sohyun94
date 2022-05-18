package class2;

import java.util.Arrays;
import java.util.Scanner;

public class B2751_수정렬하기2_시간초과 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < N; i++)
		System.out.println(arr[i]);
	}

}
