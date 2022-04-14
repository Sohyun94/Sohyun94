package d2;

import java.util.Scanner;

public class Swea_1284_수도요금경쟁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // tc
		for (int tc = 1; tc <= T; tc++) {
			int p = sc.nextInt(); // A회사 수도 요금
			int q = sc.nextInt(); // B회사 수도 요금
			int r = sc.nextInt(); // 추가 요금 내는 기준 양
			int s = sc.nextInt(); // 초과양에 대한 요금
			int w = sc.nextInt(); // 한 달 간 수도 요금
			int A = w * p; // A회사 수도 요금
			int B = 0; // B회사 수도 요금
			int cost = 0; // 실질적으로 내는 요금

			if (w <= r)
				B = q;
			else // 초과량에 대해서만 돈 내는 거니까 r 빼줘야 됨
				B = q + (w - r) * s;

			if (A < B)
				cost = A;
			else
				cost = B;
			System.out.println("#" + tc + " " + cost);
		} // tc

	}// main

}
