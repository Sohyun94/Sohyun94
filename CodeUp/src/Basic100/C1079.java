package Basic100;

import java.util.Scanner;

public class C1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char alpha = sc.next().charAt(0);
			System.out.println(alpha);
			if (alpha == 'q')
				break;
		}
	}

}
