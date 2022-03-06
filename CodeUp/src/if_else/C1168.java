package if_else;

import java.util.Scanner;

public class C1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int front = sc.nextInt();
		int back = sc.nextInt();
		int year = front / 10000;
		if(back == 1 || back ==2)
			year +=1900;
		else
			year +=2000;
		int old = 2012 - year + 1;
		System.out.println(old);

	}

}
