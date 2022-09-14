package greedy;

import java.util.Scanner;

public class B2864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String minA = "";
		String minB = "";

		String maxA = "";
		String maxB = "";
		
		for (int i = 0; i < A.length(); i++) {
			// 6이면 5로 바꿔서 넣어 주기
			if (A.charAt(i) == '6')
				minA = minA + "5";
			// 아니면 그냥 넣어 주기
			else
				minA = minA + A.charAt(i);
			if (A.charAt(i) == '5')
				maxA = maxA + "6";
			else
				maxA = maxA + A.charAt(i);
		}

		for (int i = 0; i < B.length(); i++) {
			if (B.charAt(i) == '6')
				minB = minB + "5";
			else
				minB = minB + B.charAt(i);
			if (B.charAt(i) == '5')
				maxB = maxB + "6";
			else
				maxB = maxB + B.charAt(i);
		}
		int minNoA = Integer.parseInt(minA);
		int minNoB = Integer.parseInt(minB);
		int maxNoA = Integer.parseInt(maxA);
		int maxNoB = Integer.parseInt(maxB);
		
		System.out.println((minNoA + minNoB) + " " + (maxNoA+maxNoB));
	}
}
