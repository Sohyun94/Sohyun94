package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B10610_30_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.nextLine().toCharArray();
		Arrays.sort(num);
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i] - '0';
		}
		if (sum % 3 != 0 || num[0] != '0') {
			System.out.println(-1);
		} else {
			for (int i = num.length - 1; i >= 0; i--) {
				System.out.print(num[i]);
			}
		}
	}

}