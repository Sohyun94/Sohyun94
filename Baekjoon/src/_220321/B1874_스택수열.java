package _220321;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class B1874_스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 담을 stack 생성
		Stack<Integer> st = new Stack<>();
		// 연산자 담을 ArrayList 생성 (출력을 위해)
		ArrayList<String> arr = new ArrayList<>();
		// 숫자 개수
		int N = sc.nextInt();
		// 1부터 N까지 들어갈 배열에 담기
		int list[] = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		// 수열 순서
		int idx = 0;
		// 스택에 숫자 push하고 +를 더한다
		// 1부터 시작
		for (int i = 1; i <= N; i++) {
			st.push(i);
			arr.add("+");
			// 스택이 비어 있지 않을 때
			while (!st.isEmpty()) {
				// 스택의 top에 있는 숫자와 list의 순서가 같은 경우
				if (st.peek() == list[idx]) {
					// 스택에서 숫자 꺼내기
					st.pop();
					// 배열에는 - 넣어주기
					arr.add("-");
					// 순서에 +1 해 주기
					idx++;
				} else {
					break;
				}
			}
		}//for문 끝
		//스택에 숫자가 남아 있으면 수열을 못 만든 거니 NO
		if(!st.isEmpty()) {
			System.out.println("NO");
			//아니면 출력
		} else {
			for(String s: arr) {
				System.out.println(s);
			}
		}
	}//main

}
