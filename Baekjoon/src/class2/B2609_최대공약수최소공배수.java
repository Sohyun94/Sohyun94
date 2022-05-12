package class2;

import java.util.Scanner;

public class B2609_최대공약수최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max = 1;
		int min = Integer.MAX_VALUE;
		if (A >= B) {
			for (int i = 2; i <= A; i++) {
				if (A % i == 0 && B % i == 0)
					max = i;
			}
		} else {
			for (int i = 2; i <= B; i++) {
				if (A % i == 0 && B % i == 0)
					max = i;
			}
		}

		min = (A / max) * B;
		System.out.println(max);
		System.out.println(min);
	}

}
