package Basic100;

import java.util.Scanner;

public class C1079_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha[] = sc.nextLine().split(" ");
		for(int i = 0; i < alpha.length; i++) {
			String arr = alpha[i];
			System.out.println(arr);
			if(arr.equals("q"))
				break;
		}

	}

}
