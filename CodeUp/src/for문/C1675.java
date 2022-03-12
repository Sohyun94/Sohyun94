package for문;

import java.util.Scanner;

public class C1675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] code = s.toCharArray();
		for (int i = 0; i < code.length; i++) {
			if (code[i] == ' ')
				continue;
			else
				code[i] -= 3;
		}
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}

	}

}
