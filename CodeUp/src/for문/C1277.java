package for문;

import java.util.Scanner;

public class C1277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(arr[0] + " ");
		System.out.print(arr[(N - 1) / 2] +" ");
		System.out.print(arr[N-1]);

	}

}
