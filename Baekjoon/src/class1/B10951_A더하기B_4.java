package class1;

import java.util.Scanner;

public class B10951_A더하기B_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			System.out.println(C);
		}
		sc.close();
	}

}
