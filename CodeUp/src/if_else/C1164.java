package if_else;

import java.util.Scanner;

public class C1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		if(first > 170 && second > 170 && third > 170)
			System.out.println("PASS");
		else
			System.out.println("CRASH");

	}

}
