import java.util.Scanner;

public class swea1248_공통조상 {
	public static int V, E, sv1, sv2, ansCnt, ansP; // 정점, 간선, 정점 2개
	public static int[][] tree; // [][0] 왼쪽 자식, [][1] 오른쪽 자식, [][2] 부모

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			V = sc.nextInt(); // 정점의 수
			E = sc.nextInt(); // 간선의 수
			sv1 = sc.nextInt(); // 정점 1
			sv2 = sc.nextInt(); // 정점 2

			tree = new int[V + 1][3];
			for (int i = 0; i < E; i++) {
				int p = sc.nextInt(); // 부모 노드
				int c = sc.nextInt(); // 자식 노드

				// 정점 자리 넣는 건 왼쪽부터 시작!
				// 왼쪽 자식 확인 후 비었으면 넣고, 아니라면 오른쪽 자식에 넣기
				if (tree[p][0] == 0) {
					tree[p][0] = c;
				} else {
					tree[p][1] = c;
				}
				tree[c][2] = p; // 부모 정보 저장
			} // 입력 끝
			int prev; // 위치 지정
			int node = tree[sv1][2]; // sv1의 부모 노드

			// sv1의 모든 조상 방문 처리
			while (node != 0) { // 루트 노드까지 가면 멈추기
				prev = node;
				node = tree[prev][2]; // 위치 갱신
				tree[prev][2] = -1; // 방문 처리
			}

			// sv2 시작으로 공통 조상 찾기
			ansP = tree[sv2][2];
			// 올라가다가 -1 만나면 가장 가까운 공통 조상이므로 멈추기
			while (tree[ansP][2] != -1) {
				ansP = tree[ansP][2];
			}

			// 사이즈 찾기
			ansCnt = 0;
			traversal(ansP);

			System.out.printf("#%d %d %d\n", tc, ansP, ansCnt);
		} // tc

	}// main

	// 순회 메소드 작성(사이즈 찾기 위해)
	public static void traversal(int T) {
		if (T != 0) { // T가 비어 있지 않다면
			ansCnt++; // 전위 순회 (수만 세어주면 돼서 중위 순회, 후위 순회를 써도 상관없음)
			traversal(tree[T][0]);
			traversal(tree[T][1]);
		}
	}

}
