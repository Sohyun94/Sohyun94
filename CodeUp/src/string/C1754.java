package string;

import java.util.Scanner;

public class C1754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String as = sc.next();
		String bs = sc.next();
		char a[] = as.toCharArray();
		char b[] = bs.toCharArray();
		if (a.length > b.length)
			System.out.println(bs + " " + as);
		else if (b.length > a.length)
			System.out.println(as + " " + bs);
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] > b[i]) {
					System.out.println(bs + " " + as);
					break;
				}
				else if (b[i] > a[i]) {
					System.out.println(as + " " + bs);
					break;
				}
			}
		}

	}
}
