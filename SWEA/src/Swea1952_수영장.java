import java.util.Scanner;

public class Swea1952_수영장 {
	static int ans; // 정답
	static int[] cost; // 비용
	static int[] plan; // 월 이용 계획

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			cost = new int[4];
			plan = new int[13]; // 1~12월까지니까 13칸
			ans = Integer.MAX_VALUE; // 정답 초기화
			
			for (int i = 0; i < 4; i++) {
				cost[i] = sc.nextInt();
			} // 요금 받기
			for (int i = 1; i <= 12; i++) {
				plan[i] = sc.nextInt();
			} // 월 이용 계획 받기
			
			dfs(1, 0); // 메서드 이용
			ans = Math.min(ans, cost[3]); // 1년 이용권과 비교해서 최솟값 구하기
			
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main

	private static void dfs(int month, int sum) {
		if (month > 12) { // 12월 넘어서면 없는 달이니까
			ans = Math.min(ans, sum); // 최솟값 구하고 리턴
			return;
		}
		// 1. 해당 달에 이용 계획이 없음
		if (plan[month] == 0)
			dfs(month + 1, sum); // 합계에 더할 금액 없음

		// 2. 1일 이용권 이용
		if (plan[month] > 0)
			dfs(month + 1, sum + plan[month] * cost[0]);

		// 3. 한 달 이용권 이용
		dfs(month + 1, sum + cost[1]);

		// 4. 세 달 이용권 이용 (10월까지만 가능)
		if (month <= 10)
			dfs(month + 3, sum + cost[2]);
	}

}
