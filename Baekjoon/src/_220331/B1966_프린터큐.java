package _220331;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1966_프린터큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt(); // 문서 개수
			int pos = sc.nextInt(); // 궁금한 문서 현재 위치
			int idx = 0; // 궁금한 문서 인쇄 순서

			Queue<int[]> printer = new LinkedList<>(); // 프린터 큐

			for (int i = 0; i < num; i++) { // 문서들의 현재 위치와 중요도 받기
				printer.add(new int[] { i, sc.nextInt() });
			} // 입력 끝

			while (true) {
				int[] first = printer.poll(); // 큐의 첫 번째 원소 프린터에서 꺼내기
				boolean check = true; // 가장 중요도가 큰지 판별할 boolean

				for (int p[] : printer) { // 프린터 큐 내에
					if (first[1] < p[1]) {// 첫 번째 원소보다 중요도가 큰 애가 있다면
						check = false; // false로 바꾸고
						break; // 동작 종료
					}
				} // 확인 for문
				if (check == true) { //가장 중요도가 높으면
					idx++; // idx에 1 더해 주기 (인쇄 중이니까)
					if (first[0] == pos) // 그러다가 내가 궁금한 문서 위치가 되면 멈추기
						break;
				} else {
					printer.add(first); // 아니면 프린터에 다시 넣기
				}

			} // 인쇄 과정 끝
			System.out.println(idx);
		} // tc

	}// main

}
