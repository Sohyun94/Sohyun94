package 시험공부;

import java.util.Arrays;
import java.util.Scanner;

public class 그래프02_인접행렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// V = 6, 0~6까지의 정점, 크기 V+1
		int V = sc.nextInt(); // 정점의 시작 번호 몇 개인지, 총 몇 개인지 문제 잘 보기
		int E = sc.nextInt();

		int[][] adjArr = new int[V + 1][V + 1];

		// 간선 입력받기
		for (int i = 0; i < E; i++) {
			int st = sc.nextInt(); // 시작
			int ed = sc.nextInt(); // 끝

			// 유향 그래프라면
			adjArr[st][ed] = 1;

			// 무향 그래프라면 반대로도 저장 필요
			adjArr[ed][st] = 1;

		}
		// 출력
		for (int j = 0; j <= V; j++) {
			System.out.println(Arrays.toString(adjArr[j]));
		}

	}

}
