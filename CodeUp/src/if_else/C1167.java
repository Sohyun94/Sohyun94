package if_else;

import java.util.Scanner;

public class C1167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (b >= a && b <= c || b >= c && b <= a)
			System.out.println(b);
		else if (a >= b && a <= c || a >= c && a <= b)
			System.out.println(a);
		else if (c >= a && c <= b || c >= b && c <= a)
			System.out.println(c);

	}

}
