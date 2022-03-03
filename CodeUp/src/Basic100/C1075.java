package Basic100;

import java.util.Scanner;

public class C1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (true) {
			if (a == 0) {
				break;
			}
			a--;
			System.out.println(a);
		}
	}
}
