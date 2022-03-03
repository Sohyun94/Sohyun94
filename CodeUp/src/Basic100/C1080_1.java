package Basic100;

import java.util.Scanner;

public class C1080_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int ans = 0;
		if (a >= 0 && a <= 1000) {
			while(sum < a) {
				++ans;
				sum += ans;
			}
		}
		System.out.println(ans);
	}

}
