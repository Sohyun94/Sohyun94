package string;

import java.util.Scanner;

public class C1419 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String love[] = sc.nextLine().split("");
		int cnt = 0;
		for(int i= 0; i < love.length - 3; i++) {
			if(love[i].equals("l") && love[i+1].equals("o") && love[i+2].equals("v") && love[i+3].equals("e")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
