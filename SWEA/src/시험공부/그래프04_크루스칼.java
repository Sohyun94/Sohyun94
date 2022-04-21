package 시험공부;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 그래프04_크루스칼 {
	static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // V : 정점의 개수 (0부터 시작)
		int E = sc.nextInt(); // E : 간선의 개수

		// 간선배열을 이용해서 저장
		int[][] edges = new int[E][3];

		for (int i = 0; i < E; i++) {
			edges[i][0] = sc.nextInt();// [0] 시작점
			edges[i][1] = sc.nextInt();// [1] 끝점
			edges[i][2] = sc.nextInt();// [2] 가중치
		} // 입력 끝

		// 간선을 가중치로 오름차순 정렬
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		p = new int[V];
		// makeset을 하여 나 자신을 대표로 초기화.
		for (int i = 0; i < V; i++) {
//			makeSet(i);
			p[i] = i;
		}

		int ans = 0;

		// mst 만들어 보자.
		// 간선을 N-1개 선택하면 break;
		// union이라는 이곳을 쪼금 손대면 어떨까?
		int pick = 0;
		for (int i = 0; i < E; i++) {
			int px = findSet(edges[i][0]);
			int py = findSet(edges[i][1]);

			if (px != py) {
				union(px, py);
				ans += edges[i][2];
				pick++;
			}
			if (pick == (V - 1))
				break;
		}

		System.out.println(ans);

	}

	static void makeSet(int x) {
		p[x] = x;
	}

	static int findSet(int x) {
//		if(x ==p[x]) return x;
//		return p[x] = findSet(p[x]);
		if (p[x] != x)
			p[x] = findSet(p[x]);
		return p[x];
	}

	static void union(int x, int y) {
		p[findSet(y)] = findSet(x); // 정석

//		p[y] = x ;//이번 경우에서는 이와 같이 작성해도 상관 없음. 
		// 어차피 대표를 찾아서 union을 호출할거니까.
		// 항상 왜 사용하는지를 알고 쓰기.
	}

	static String input = "7 11 \r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n";
}
