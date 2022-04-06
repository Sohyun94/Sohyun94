import java.util.ArrayList;
import java.util.Scanner;

public class swea6808_규영인영카드게임 {
	static int[] node; // 노드
	static int[] line; // 간선
	static ArrayList<Integer> kyu; // 규영이 카드 리스트
	static ArrayList<Integer> in; // 인영이 카드 리스트
	static int win; // 승리
	static int lose; // 패배
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			int[] cards = new int[19];
			cnt = 0;
			kyu = new ArrayList<>();
			in = new ArrayList<>();
			node = new int[10];
			line = new int[10];
			win = 0;
			lose = 0;

			for (int i = 0; i < 9; i++) {
				int tmp = sc.nextInt();
				cards[tmp] = 1;
			}

			for (int i = 1; i < 19; i++) {
				if (cards[i] == 0)
					in.add(i);
				else
					kyu.add(i);
			}

			for (int i = 1; i < 10; i++) {
				dfs(i, 1);
			}
			System.out.println("#" + tc + " " + win + " " + lose);
		} // tc

	}

	private static void dfs(int start, int depth) {
		node[start] = 1;
		line[depth - 1] = start;

		if (depth == 9) {
			int kyuScore = 0;
			int inScore = 0;
			for (int i = 0; i < 9; i++) {
				int kyuCard = kyu.get(i);
				int inCard = in.get(line[i] - 1);

				if (kyuCard > inCard)
					kyuScore += kyuCard + inCard;
				else
					inScore += kyuCard + inCard;
			}
			if (kyuScore > inScore)
				win++;
			else if (inScore > kyuScore)
				lose++;
		}
		for (int i = 1; i < 10; i++) {
			if (node[i] == 0) {
				dfs(i, depth + 1);
				node[i] = 0;
			}
		}
		node[start] = 0;

	}// main

}
