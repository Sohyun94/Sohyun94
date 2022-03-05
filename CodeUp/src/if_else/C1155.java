package if_else;

import java.util.Scanner;

public class C1155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 7 == 0) {
			System.out.println("multiple");
		}
		else
			System.out.println("not multiple");

	}

}
