package if_else;

import java.util.Scanner;

public class C1169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int old = sc.nextInt();
		if (old <= 13) {
			int year = (2012 - old + 1) % 2000;
			System.out.println(year + " " + 3);
		} else {
			int year = (2012 - old + 1) % 1900;
			System.out.println(year + " " + 1);
		}
	}
}
