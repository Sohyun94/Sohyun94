package if_else;

import java.util.Scanner;

public class C1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int min = sc.nextInt();
		if (time == 0 && min < 30)
			System.out.println(23 + " " + (60 + min - 30));
		else if (time != 0 && min < 30)
			System.out.println((time - 1) + " " + (60 + min - 30));
		else if (min >= 30)
			System.out.println(time + " " + (min - 30));

	}

}
