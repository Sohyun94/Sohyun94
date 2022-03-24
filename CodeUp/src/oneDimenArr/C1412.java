package oneDimenArr;

import java.util.Scanner;

public class C1412 {

	public static void main(String[] args) {
		// 풀.참
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26];
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 97 && c <= 122)
			alphabet[c - 'a']++;
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char) (97 + i) + ":" + alphabet[i]);
		}
	}

}
