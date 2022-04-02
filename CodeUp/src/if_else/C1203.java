package if_else;

import java.util.Scanner;

public class C1203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a <= 10)
			System.out.println("정상");
		else if (10 < a && a <= 20)
			System.out.println("과체중");
		else if (a>20)
			System.out.println("비만");
	}

}
