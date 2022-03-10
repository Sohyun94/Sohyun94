package for문;

import java.util.Scanner;

public class C1274 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
