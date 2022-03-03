package Basic100;

import java.util.Scanner;

public class C1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int day = 1;
		do {
			if (day % a == 0 && day % b == 0 && day % c == 0)
				break;
			day++;
		} while (true);
		System.out.println(day);
	}

}
