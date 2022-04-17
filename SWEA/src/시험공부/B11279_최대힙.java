package 시험공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B11279_최대힙 {
	//스캐너 썼는데 시간 초과 떠서 버퍼드리더로 받음
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int op = Integer.parseInt(br.readLine()); // 연산 받기
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 순서 거꾸로 배치하기
		for (int i = 0; i < op; i++) {
			int x = Integer.parseInt(br.readLine()); // 정수 받기
			if (x == 0) { // 0이 주어지면
				if (!pq.isEmpty()) { // 배열이 비어 있지 않을 때
					System.out.println(pq.poll()); // 가장 큰 값 출력
				} else { // 배열이 비어 있을 때는
					System.out.println(0); // 0 출력
				}
			}
			pq.add(x); //아니면 q에 더해주기
		}

	}

}
