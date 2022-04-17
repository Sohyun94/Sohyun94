import java.util.Scanner;

public class Swea7465_창용마을무리 {
	static int person, rel; // 마을 사람 수, 서로 알고 있는 관계 수
	static int[] p; // 부모 정보 담아둘 배열? 생성
	static int cnt; // 정답

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc <= T; tc++) {
			person = sc.nextInt();
			rel = sc.nextInt();
			cnt = 0;

			makeSet();

			for (int i = 0; i < rel; i++) {
				int one = sc.nextInt(); // 사람 1
				int two = sc.nextInt(); // 사람 2

				union(one, two); // 사람 1, 2 합치기
			} // 사람 입력 끝
			counting();
			System.out.println("#" + tc + " " + cnt);
		} // tc

	} // main

	// 무리 세어 주기
	private static int counting() {
		cnt = 0;
		for (int i = 1; i < person + 1; i++) {
			if (p[i] == i)
				cnt++;
		}
		return cnt;

	}

	// 사람 1과 2 합친 집합 만들기
	private static void union(int one, int two) {
		int p_one = findSet(one);
		int p_two = findSet(two);
		if (p_one != p_two)
			p[p_two] = p_one;
	}

	// 유일 멤버 포함할 집합 생성
	private static void makeSet() {
		p = new int[person + 1]; // 배열 생성
		for (int i = 1; i < person + 1; i++) {
			p[i] = i;
		}

	}

	// x 포함한 집합 찾기
	private static int findSet(int x) {
		if (p[x] == x)
			return x;
		return p[x] = findSet(p[x]);
	}

}
