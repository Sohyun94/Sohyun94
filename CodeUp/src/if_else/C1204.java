package if_else;

import java.util.Scanner;

public class C1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rest = num % 10;
		if (rest == 1) {
			if (num == 11)
				System.out.println(num + "th");
			else
				System.out.println(num + "st");
		} else if (rest == 2) {
			if (num == 12)
				System.out.println(num + "th");
			else
				System.out.println(num + "nd");
		} else if (rest == 3) {
			if (num == 13)
				System.out.println(num + "th");
			else
				System.out.println(num + "rd");
		} else {
			System.out.println(num + "th");
		}
	}
}
