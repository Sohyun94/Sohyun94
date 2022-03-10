package for문;

import java.util.Scanner;

public class C1268 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <n; i++) {
			int a = sc.nextInt();
			if(a % 2 == 0)
				cnt++;
		}
		System.out.println(cnt);
	}

}
