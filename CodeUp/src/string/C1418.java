package string;

import java.util.Scanner;

public class C1418 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.next().split("");
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("t"))
				System.out.print((i+1) + " ");
		}

	}

}
