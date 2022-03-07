package if_else;

import java.util.Scanner;

public class C1226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[7];
		int[] you = new int[6];
		int count = 0;
		int bonus = 0;
		for (int i = 0; i < 7; i++) {
			lotto[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			you[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == you[j])
					count++;
			}
		} // for문
		for (int i = 0; i < 6; i++) {
			if (lotto[6] == you[i])
				bonus += 1;
		}
		if (count == 6) {
			System.out.println("1");
		} else if (count == 5 && bonus == 1) {
			System.out.println("2");
		} else if (count == 5) {
			System.out.println("3");
		} else if (count == 4) {
			System.out.println("4");
		} else if (count == 3) {
			System.out.println("5");
		} else {
			System.out.println("0");
		}
	}
}
