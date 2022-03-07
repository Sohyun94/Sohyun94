package if_else;

import java.util.Scanner;

public class C1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noad = sc.nextInt();
		int ad = sc.nextInt();
		int cost = sc.nextInt();
		if (ad - cost > noad)
			System.out.println("advertise");
		else if (ad - cost < noad)
			System.out.println("do not advertise");
		else
			System.out.println("does not matter");

	}

}
