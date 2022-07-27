package greedy;

import java.util.Scanner;

public class B10162_전자레인지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A, B, C;
		A = B = C = 0;
		while (T >= 10) {
			if(T >= 300) {
				A = T / 300;
				T = T % (A * 300);
			} else if(T >= 60) {
				B = T / 60;
				T = T % (B * 60);
			} else {
				C = T / 10;
				T = T % (C * 10);
			}
		}
		if(T == 0)
			System.out.println(A + " " +  B + " " + C);
		else
			System.out.println(-1);
	}

}
