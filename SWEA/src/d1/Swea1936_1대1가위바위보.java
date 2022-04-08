package d1;

import java.util.Scanner;

public class Swea1936_1대1가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 1 && B == 2 || A == 2 && B == 3 || A == 3 && B == 1)
			System.out.print("B");
		else if(B == 1 && A == 2 || B == 2 && A == 3 || B == 3 && A == 1)
			System.out.print("A");

	}

}
