package class1;

import java.util.Scanner;

public class B10089_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int[] cc = new int[c.length];
		int[] alpha = new int[26];
		for (int i = 0; i < alpha.length; i++)
			alpha[i] = -1;
		for (int i = 0; i < cc.length; i++) {
			cc[i] = c[i] - 'a';
		}
		for (int i = 0; i < cc.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (cc[i] == j && alpha[j] == -1)
					alpha[j] = i;
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}

	}
}
