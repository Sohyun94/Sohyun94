package if_else;

import java.util.Scanner;

public class C1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playtime = sc.nextInt();
		int goal = sc.nextInt();
		int sum = 0;
		if (playtime % 5 == 0) {
			sum = (90 - playtime) / 5 + goal;
			System.out.println(sum);
		} else {
			sum = (90 - playtime) / 5 + 1 + goal;
			System.out.println(sum);
		}

	}

}
