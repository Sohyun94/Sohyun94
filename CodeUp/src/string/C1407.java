package string;

import java.util.Scanner;

public class C1407 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
