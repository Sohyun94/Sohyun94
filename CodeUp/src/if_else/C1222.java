package if_else;

import java.util.Scanner;

public class C1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int goal1 = sc.nextInt();
		int goal2 = sc.nextInt();
		if (time < 90) {
			if (time % 5 == 0) {
				goal1 += (90 - time) / 5;
			} else {
				goal1 += (90 - time) / 5 + 1;
			}
		} // if문
		if (goal1 > goal2)
			System.out.println("win");
		else if (goal1 == goal2)
			System.out.println("same");
		else
			System.out.println("lose");
	}// main
}
