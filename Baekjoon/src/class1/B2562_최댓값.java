package class1;

import java.util.Scanner;

public class B2562_최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max)
				System.out.println(i+1);
		}
	}

}
