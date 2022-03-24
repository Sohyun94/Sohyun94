package oneDimenArr;

import java.util.Scanner;

public class C1405 {

	public static void main(String[] args) {
		// 풀.참
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i <arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

}
