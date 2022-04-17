package 시험공부;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프01_인접리스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// V = 6, 0~6까지의 정점, 크기 V+1
		int V = sc.nextInt(); // 정점의 사작 번호 몇 개인지, 총 몇 개인지 문제 잘 보기
		int E = sc.nextInt();

		List<Integer>[] adjList = new ArrayList[V + 1];

		// 각각의 ArrayList를 new 해 주기
		for (int i = 0; i < V + 1; i++) {
			adjList[i] = new ArrayList<>();
		}

		// 간선 입력받기
		for (int i = 0; i < E; i++) {
			int st = sc.nextInt(); // 시작
			int ed = sc.nextInt(); // 끝

			// 유향 그래프라면
			adjList[st].add(ed);

			// 무향 그래프라면 반대로도 저장 필요
			adjList[ed].add(st);

		}
		// 출력
		for (int i = 0; i <= V; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < adjList[i].size(); j++) {
				System.out.print(adjList[i].get(j) + " ");
			}
			System.out.println();
		}

	}

}
