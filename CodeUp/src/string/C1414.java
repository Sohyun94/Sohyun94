package string;

import java.util.Scanner;

public class C1414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] pw = sc.next().split("");
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i = 0; i < pw.length; i++) {
			if(pw[i].equals("c") || pw[i].equals("C")) {
				cnt1++;
			}
			if(i < pw.length-1)
				if (pw[i].equals("c") && pw[i+1].equals("C") || pw[i].equals("c") && pw[i+1].equals("c") || pw[i].equals("C") && pw[i+1].equals("C") || pw[i].equals("C") && pw[i+1].equals("c") )
				cnt2++;
		}
		System.out.println(cnt1);
		System.out.println(cnt2);
	}

}
