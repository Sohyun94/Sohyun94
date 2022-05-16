package baekjoon;

import java.util.Scanner;

public class B5622_다이얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		int ans = 0;
		char[] cdial = new char[dial.length()];
		for (int i = 0; i < cdial.length; i++) {
			cdial[i] = dial.charAt(i);
		}
		for(int i = 0; i < cdial.length; i++) {
			if(cdial[i] == 'A' || cdial[i] == 'B' || cdial[i] == 'C')
				ans += 3;
			else if(cdial[i] == 'D' || cdial[i] == 'E' || cdial[i] == 'F')
				ans += 4;
			else if(cdial[i] == 'G' || cdial[i] == 'H' || cdial[i] == 'I')
				ans += 5;
			else if(cdial[i] == 'J' || cdial[i] == 'K' || cdial[i] == 'L')
				ans += 6;
			else if(cdial[i] == 'M' || cdial[i] == 'N' || cdial[i] == 'O')
				ans += 7;
			else if(cdial[i] == 'P' || cdial[i] == 'Q' || cdial[i] == 'R' || cdial[i] == 'S')
				ans += 8;
			else if(cdial[i] == 'V' || cdial[i] == 'T' || cdial[i] == 'U')
				ans += 9;
			else if(cdial[i] == 'X' || cdial[i] == 'W' || cdial[i] == 'Y' || cdial[i] == 'Z')
				ans += 10;
		}
		System.out.println(ans);
	}
}
