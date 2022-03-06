package if_else;

import java.util.Scanner;

public class C1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int trash = sc.nextInt();
		int ten = (trash % 10) * 10;
		int one = trash / 10;
		int num = (ten + one) * 2;
		if (num >= 100) {
			num %= 100;
		}
		System.out.println(num);
		if (num <= 50)
			System.out.println("GOOD");
		else
			System.out.println("OH MY GOD");

	}

}
