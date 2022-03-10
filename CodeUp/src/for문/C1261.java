package for문;

import java.util.Scanner;

public class C1261 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		int nnum = 0;
		for (int i = 0; i < 10; i++) {
			nnum = Integer.parseInt(num[i]);
			if (nnum % 5 == 0) {
				System.out.println(nnum);
				break;
			}
		} // for문
		if (nnum % 5 != 0) {
			System.out.println(0);
		}
	}
}
