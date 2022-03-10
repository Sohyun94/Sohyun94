package for문;

import java.util.Scanner;

public class C1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
