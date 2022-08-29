package greedy;

import java.util.Scanner;

public class B4796_캠핑장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (sc.hasNext()) {
			n++;
			int L = sc.nextInt(); // 사용 가능한 기간
			int P = sc.nextInt(); // 연속하는 기간
			int V = sc.nextInt(); // 휴가 기간
			int Q = 0; // 몫
			int R = 0; // 나머지
			int ans = 0;
			if(L== 0 && P == 0 && V == 0)
				break;
			Q = V / P;
			R = V % P;
			// 나머지가 사용 가능 기간보다 더 큰 경우에는 사용 기간을 택해야 된다
			ans = Q * L + Math.min(R, L);
			System.out.println("Case " + n + ": " + ans);
		}
	}
}
