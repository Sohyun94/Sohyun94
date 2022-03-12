package for문;

import java.util.Scanner;

public class C1294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] code = s.toCharArray();
		for (int i = 0; i < code.length; i++) {
			if (code[i] == ' ')
				continue;
			else if (code[i] == 'x')
				code[i] = 'a';
			else if (code[i] == 'y')
				code[i] = 'b';
			else if (code[i] == 'z')
				code[i] = 'c';
			else
				code[i] += 3;
		}
		System.out.println(code);
	}

}
