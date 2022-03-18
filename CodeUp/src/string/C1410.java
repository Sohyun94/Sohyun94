package string;

import java.util.Scanner;

public class C1410 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		int ocnt = 0;
		int ccnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("("))
				ocnt++;
			else if(str[i].equals(")"))
				ccnt++;
		}
		System.out.println(ocnt + " " + ccnt);
	}

}
