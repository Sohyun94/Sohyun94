package Basic100;

import java.util.Scanner;

public class C1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int i = 0;
		for(i = 1; i <= a; i++) {
			sum += i;
			if(sum >= a)
				break;
		}
		System.out.println(i);

	}

}
