package for문;

import java.util.Scanner;

public class C1285_fail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cal = sc.nextLine().toCharArray();
		int[] cal2 = new int[cal.length / 2];
		for (int i = 0; i < cal.length - 2; i++) {
//			for (int j = 0; j < cal.length/2; j++) {
			if (cal[i + 1] == '+')
				cal2[i] = cal[i] + cal[i + 2];
			else if (cal[i + 1] == '-')
				cal2[i] = cal[i] - cal[i + 2];
			else if (cal[i + 1] == '*')
				cal2[i] = cal[i] * cal[i + 2];
			else if (cal[i + 1] == '/')
				cal2[i] = cal[i] / cal[i + 2];
			else
				continue;
//			}
		}
		System.out.println((cal2[cal.length / 2]));
	}

}
