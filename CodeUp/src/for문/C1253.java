package for문;

import java.util.Scanner;

public class C1253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		} // if문
		if (b < a) {
			for (int i = b; i <= a; i++) {
				System.out.print(i + " ");
			}
		} // if문

	}
}
