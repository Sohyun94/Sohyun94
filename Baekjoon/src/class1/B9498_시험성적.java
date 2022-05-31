package class1;

import java.util.Scanner;

public class B9498_시험성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		if (90 <= g && g <= 100)
			System.out.println("A");
		else if (80 <= g && g <= 89)
			System.out.println("B");
		else if(70 <= g && g <= 79)
			System.out.println("C");
		else if(60 <= g && g <= 69)
			System.out.println("D");
		else
			System.out.println("F");

	}
}
