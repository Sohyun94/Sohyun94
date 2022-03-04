package 출력과연산자;

import java.util.Scanner;

public class C1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = (a > b ? b : a) > c ? c : (a > b ? b : a);
		System.out.println(min);

	}

}
