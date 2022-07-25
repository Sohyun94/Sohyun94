package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1026_보물 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N ; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
//		for(int i = 0; i < N; i++) {
//			System.out.print(A[i] + " ");
//		}
//		for(int i = 0; i < N; i++) {
//			System.out.print(B[i] + " ");
//		}
		for(int i = 0; i < N; i++) {
			min += A[i] * B[N-i-1];
		}
		System.out.println(min);
	}

}
