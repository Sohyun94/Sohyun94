package class1;

import java.util.Scanner;

public class B2908_상수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int newA = (A % 10) * 100 + ((A % 100) - (A % 10)) + (A / 100);
		int newB = (B % 10) * 100 + ((B % 100) - (B % 10)) + (B / 100);
		if(newA > newB)
			System.out.println(newA);
		else
			System.out.println(newB);
	}

}
