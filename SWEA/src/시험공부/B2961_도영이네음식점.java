import java.util.Scanner;

public class B2961_도영이네음식점 {
	static int[][] ingre; // 재료 2차원 배열 (0: 신맛, 1: 쓴맛)
	static int ans; // 정답
	static boolean[] isUsed; // 재료 사용 여부 저장

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ingre = new int[n][2]; // 쓴맛, 신맛 2개
		isUsed = new boolean[n];
		ans = Integer.MAX_VALUE; // 정답 초기화

		for (int i = 0; i < n; i++) {
			ingre[i][0] = sc.nextInt();
			ingre[i][1] = sc.nextInt();
		} // 재료 담기
		cook(0);
		System.out.println(ans);
	}// main

	public static void cook(int curr) {
		if (curr == ingre.length) { // curr이 재료 배열 마지막에 도달하면
			int sour = 1;
			int bitter = 0;
			int cnt = 0;
			for (int i = 0; i < isUsed.length; i++) {
				if (isUsed[i]) { // 사용한 재료라면
					cnt++;
					sour *= ingre[i][0]; // 신맛 : 곱
					bitter += ingre[i][1]; // 쓴맛 : 합
				}
			} // 맛 배합(?)
			if (cnt == 0) // 이 경우 재료 아예 선택 안 한 공집합이므로
				return;
			if (ans > Math.abs(sour - bitter)) // 어떤 게 더 수가 큰지 모르니까 절댓값으로 구하기
				ans = Math.abs(sour - bitter); // 최솟값이 정답이니까
			return;
		} // 재귀 시작
		isUsed[curr] = true;
		cook(curr + 1);
		isUsed[curr] = false;
		cook(curr + 1);
	} // 메서드 끝
}
