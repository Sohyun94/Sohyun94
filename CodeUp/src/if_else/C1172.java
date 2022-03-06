package if_else;

import java.util.Scanner;

public class C1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a <= b && b <= c)
			System.out.println(a + " " + b + " " + c);
		else if (c <= b && b <= a)
			System.out.println(c + " " + b + " " + a);
		else if (b <= a && a <= c)
			System.out.println(b + " " + a + " " + c);
		else if (c <= a && a <= b)
			System.out.println(c + " " + a + " " + b);
		else if (a <= c && c <= b)
			System.out.println(a + " " + c + " " + b);
		else
			System.out.println(b + " " + c + " " + a);

	}

}
