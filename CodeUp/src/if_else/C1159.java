package if_else;

import java.util.Scanner;

public class C1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ball = sc.nextInt();
		if(50 <= ball && ball <= 70 || ball % 6 ==0)
			System.out.println("win");
		else
			System.out.println("lose");

	}

}
