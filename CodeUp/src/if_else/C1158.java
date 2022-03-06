package if_else;

import java.util.Scanner;

public class C1158 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ball = sc.nextInt();
		if(30 <= ball && ball <= 40 || 60 <= ball && ball <= 70) {
			System.out.println("win");
		}
		else
			System.out.println("lose");

	}

}
