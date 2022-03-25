package oneDimenArr;

import java.util.Scanner;

public class C1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ": ");
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (arr[i] < arr[j])
						System.out.print("< ");
					else if (arr[i] == arr[j])
						System.out.print("= ");
					else if (arr[i] > arr[j])
						System.out.print("> ");
				}
			}
			System.out.println();
		}
	}
}