package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2252_줄세우기 {
	// 위상 정렬 순서
	// 1. 인접 행렬 배열과 진입 차수 배열 혹은 리스트 만들어 입력받음
	// 2. 큐에 진입 차수 0인 노드 저장
	// 3. 큐가 빌 때까지 진입 차수 0인 노드 꺼냄
	// 4. 그 노드와 연결된 노드의 진입 차수 1씩 줄임
	// 5. 진입 차수 0이 되면 해당 노드 큐에 넣음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 학생 수
		int cnt = sc.nextInt(); // 키 비교 횟수

		int[] indegree = new int[num + 1]; // 진입 차수 배열
		// 노드가 1부터니까 리스트도 한 칸 더 늘려서
		ArrayList<Integer>[] list = new ArrayList[num + 1]; // 인접 행렬 리스트
		for (int i = 1; i <= num; i++) {
			list[i] = new ArrayList<>(); // 인접 행렬 입력받기
		}
		for (int i = 0; i < cnt; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			list[A].add(B);
			indegree[B]++;
		} // 정점 두 개 입력받고 진입 차수 늘려주기

		// 진입 차수 0인 노드 저장할 Q 생성
		Queue<Integer> q = new LinkedList<Integer>();
		// 반복문 1부터 시작~
		for (int i = 1; i <= num; i++) {
			if (indegree[i] == 0) { // 진입 차수 0이면 추가
				q.add(i);
			}
		}
		// 큐 빌 때까지 꺼내서 출력
		while (!q.isEmpty()) {
			System.out.print(q.peek() + " ");

			int curr = q.poll();
			// 리스트에서 다음에 연결된 노드 꺼내 와서 진입 차수 1 감소시키기
			for (int i = 0; i < list[curr].size(); i++) {
				int C = list[curr].get(i);
				indegree[C]--;
				//진입 차수 0이면 큐에 넣기
				if (indegree[C] == 0)
					q.add(C);
			}

		}
	} // main
}
