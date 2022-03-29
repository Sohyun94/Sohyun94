import java.util.Scanner;

public class swea1231_중위순회 {
	// 중위 순회: LVR 왼쪽 자식 노드 -> 부모 노드 -> 오른쪽 자식 노드
	static int N; // 노드 수
	static char[] tree; // 트리 배열
	static String ans; // 정답

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) { // 테스트 케이스 10개
			N = sc.nextInt();
			tree = new char[N + 1];
			ans = "";
			sc.nextLine();
			for (int i = 1; i <= N; i++) {
				String[] str = sc.nextLine().split(" ");
				tree[i] = str[1].charAt(0); // String을 Char로 변환해 담기
			} // 정점 받기 끝
			arrange(1);
			System.out.println("#" + tc + " " + ans);
		} // tc

	}// main

	// 재귀
	static void arrange(int node) {
		if (node > N) { // node가 N보다 크면 부른 곳으로
			return;
		}
		arrange(node * 2); //왼쪽 자식
		ans += tree[node];
		arrange(node * 2 + 1); // 오른쪽 자식
	}
}
