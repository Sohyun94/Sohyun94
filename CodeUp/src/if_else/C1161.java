package if_else;

import java.util.Scanner;

public class C1161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 % 2 == 0)
			System.out.print("짝수+");
		else
			System.out.print("홀수+");
		if (num2 % 2 == 0)
			System.out.print("짝수=");
		else
			System.out.print("홀수=");
		if (num1 % 2 == 0 && num2 % 2 == 0 || num1 % 2 != 0 && num2 % 2 != 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

	}

}
