package if_else;

import java.util.Scanner;

public class C1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] menu = {400, 340, 170, 100, 70};
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(menu[a-1] + menu[b-1] > 500) {
			System.out.println("angry");
		}
		else
			System.out.println("no angry");

	}

}
