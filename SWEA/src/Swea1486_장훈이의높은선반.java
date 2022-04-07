import java.util.Scanner;

public class Swea1486_장훈이의높은선반 {
	static int num, top, ans;
	static int[] worker = new int[20]; // 점원 최대 20명
	static boolean[] used = new boolean[20]; // 사용된 점원 판별할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테케 수
		for (int tc = 1; tc <= T; tc++) {
			num = sc.nextInt(); // 점원 수
			top = sc.nextInt(); // 탑의 높이
			worker = new int[num]; // 점원들 키 담을 배열
			ans = Integer.MAX_VALUE; // 정답 최댓값으로 초기화

			for (int i = 0; i < num; i++) {
				worker[i] = sc.nextInt();
			} // 키 담기 끝
			powerset(0);
			System.out.println("#" + tc + " " + ans);
		} // tc

	}

	private static void powerset(int idx) {
		if (idx == num) { // 점원 수에 도달했을 때
			int sum = 0; // 합계 초기화

			for (int i = 0; i < num; i++) { // 0부터 num 전까지 사용되었으면
				if (used[i]) // 합계에 뽑힌 점원들 키 넣기
					sum += worker[i];
			}
			if (sum >= top) { // 합계가 top 높이보다 커지면
				sum -= top; // 합계에서 top 높이 빼기
				ans = Math.min(ans, sum); // 더 작은 값이 정답
			}

			return;
		}
		used[idx] = true; //사용하기 전이라면 사용하기
		powerset(idx + 1);
		used[idx] = false;
		powerset(idx + 1);

	}// main

}
