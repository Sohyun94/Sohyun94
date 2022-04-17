package 시험공부;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프03_간선배열 {
	static class Edge {
		int st, ed;

		public Edge(int st, int ed) {
			this.st = st;
			this.ed = ed;
		}

		@Override
		public String toString() {
			return "Edge [st=" + st + ", ed=" + ed + "]";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// V = 6, 0~6까지의 정점, 크기 V+1
		int V = sc.nextInt(); // 정점의 사작 번호 몇 개인지, 총 몇 개인지 문제 잘 보기
		int E = sc.nextInt();

		Edge[] edges = new Edge[E];

		// 간선 입력받기
		for (int i = 0; i < E; i++) {
			int st = sc.nextInt(); // 시작
			int ed = sc.nextInt(); // 끝
			
			edges[i] = new Edge(st, ed);
			//출력
			System.out.println(edges[i]);

		}

	}

}
