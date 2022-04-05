package _220404;

import java.util.Scanner;

public class B2606_바이러스 {
	static int route[][]; // 방문한 경로 저장하는 배열
	static boolean isVisited[]; // 방문 여부 확인할 boolean
	static int computer, line, start; // 컴퓨터 수, 간선 수, 탐색 시작할 정점 번호
	static int cnt = 0;

	//결국 간선으로 연결된 컴퓨터는 전부 감염된다고 봐도 무방
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		computer = sc.nextInt();
		line = sc.nextInt();
		start = 1;
		route = new int[computer + 1][computer + 1];
		isVisited = new boolean[computer + 1];

		for (int i = 0; i < line; i++) { // 서로 연결된 컴퓨터
			int com1 = sc.nextInt();
			int com2 = sc.nextInt();
			route[com1][com2] = 1;
			route[com2][com1] = 1;
		} //컴퓨터 받기
		System.out.println(dfs(1));

	}// main

	public static int dfs(int i) {
		isVisited[i] = true;

		for (int j = 1; j <= computer; j++) { // 탐색 시작할 정점이고 방문 아직 안 했으면 카운트 더하기
			if (route[i][j] == 1 && isVisited[j] == false) {
				cnt++;
				dfs(j);
			}
		}
		return cnt;
	}

}
