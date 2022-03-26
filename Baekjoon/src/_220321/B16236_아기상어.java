package _220321;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B16236_아기상어 {
	// 이번에 왜 이렇게 어려운 문제만 고른 거야 ^ㅅ^ (풀참)
	// 이거 역량 테스트 문제였나 보네
	public static class Node {
		int x;
		int y;
		int d;

		public Node(int x, int y, int d) {
			super();
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	static int N; // 공간 크기
	static int[][] space; // 공간
	static int[] dr = { -1, 0, 1, 0 }; // 상좌하우 (위쪽 탐색하고 다음 왼쪽 본다는 조건이 있어서)
	static int[] dc = { 0, -1, 0, 1 };
	static ArrayList<Node> fish;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		space = new int[N][N];
		Queue<Node> q = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				space[i][j] = sc.nextInt();
				if(space[i][j] == 9) { //아기 상어가 있으면
					q.add(new Node(i, j, 0)); //새 노드 추가하고
					space[i][j] = 0; // 위치 빈당
				}
			}
		}
	}//main

}
