package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B10610_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.nextLine().toCharArray();
		Arrays.sort(num);
		long number = 0;
			for(int i = num.length - 1 ; i >= 0 ; i--) {
				number += (long)((num[i] - '0') * Math.pow(10, i));
			}
			if(number % 30 != 0)
				System.out.print(-1);
			else
				System.out.print(number);
		}

}