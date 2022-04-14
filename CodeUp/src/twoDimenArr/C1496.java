package twoDimenArr;

import java.util.Scanner;

public class C1496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = 0;
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n; i += 2) {
			if (arr[i] < arr[i + 1])
				min = arr[i];
			else
				min = arr[i + 1];
			System.out.print(min + " ");
		}
	}

}
