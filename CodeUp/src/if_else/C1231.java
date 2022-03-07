package if_else;

import java.util.Scanner;

public class C1231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cal = sc.next();
		if (cal.contains("+")) {
			String[] cal2 = cal.split("\\+");
			System.out.println(Integer.parseInt(cal2[0]) + Integer.parseInt(cal2[1]));
		} else if (cal.contains("-")) {
			String[] cal2 = cal.split("\\-");
			System.out.println(Integer.parseInt(cal2[0]) - Integer.parseInt(cal2[1]));
		} else if (cal.contains("*")) {
			String[] cal2 = cal.split("\\*");
			System.out.println(Integer.parseInt(cal2[0]) * Integer.parseInt(cal2[1]));
		} else if (cal.contains("/")) {
			String[] cal2 = cal.split("\\/");
			System.out.printf("%.2f", (double) Integer.parseInt(cal2[0]) / Integer.parseInt(cal2[1]));

		}
	}

}
