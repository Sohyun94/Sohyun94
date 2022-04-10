package d1;

import java.util.Scanner;

public class Swea2056_연월일달글 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1 ; tc <= T; tc++) {
		String num = sc.next();
		int year = Integer.parseInt(num.substring(0, 4));
		int month = Integer.parseInt(num.substring(4, 6));
		int day = Integer.parseInt(num.substring(6, 8));
		System.out.print("#" + tc + " ");
		if (1 <= month && month <= 12) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12 && 1 <= day && day <= 31)
				System.out.printf("%04d/%02d/%02d\n", year, month, day);
			else if (month == 4 || month == 6 || month == 9 || month == 11 && 1 <= day && day <= 30)
				System.out.printf("%04d/%02d/%02d\n", year, month, day);
			else if (month == 2 && 1 <= day && day <= 28)
				System.out.printf("%04d/%02d/%02d\n", year, month, day);
			else
				System.out.printf("%d\n", -1);
		}
		else
			System.out.printf("%d\n", -1);
		}
	}

}
