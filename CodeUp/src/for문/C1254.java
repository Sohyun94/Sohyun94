package for문;

import java.util.Scanner;

public class C1254 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char aa = sc.next().charAt(0);
		char bb = sc.next().charAt(0);
		for (int i = aa; i <= bb; i++) {
			System.out.print((char) (i) + " ");
		}
	}// main

}
