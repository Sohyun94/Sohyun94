package string;

import java.util.Scanner;

public class C2721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = sc.next().toCharArray();
		char b[] = sc.next().toCharArray();
		char c[] = sc.next().toCharArray();
		if(a[a.length-1] == b[0] && b[b.length-1] == c[0] && c[c.length-1] == a[0])
			System.out.println("good");
		else
			System.out.println("bad");

	}

}
