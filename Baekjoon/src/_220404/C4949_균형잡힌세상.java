package _220404;

import java.util.Scanner;
import java.util.Stack;

public class C4949_균형잡힌세상 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine(); // 한 줄씩 받기

			if (line.equals(".")) { // 맨 뒤에 점 찍혀 있으면 문장 끝
				break;
			}
			System.out.println(find(line));
		}

	}// main

	public static String find(String line) {
		Stack<Character> bracket = new Stack<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i); // 한 글자씩 잘라서 확인

			if (c == '(' || c == '[') // 여는 괄호면 넣기
				bracket.push(c);
			else if (c == ')') { // 닿는 소괄호면
				if (bracket.isEmpty() || bracket.peek() != '(') // 스택이 비거나 여는 소괄호가 top에 없으면
					return "no";
				else
					bracket.pop(); // 아님 꺼내기
			} else if (c == ']') { // 닿는 대괄호면
				if (bracket.isEmpty() || bracket.peek() != '[') // 스택이 비거나 여는 소괄호가 top에 없으면
					return "no";
				else
					bracket.pop(); // 아님 꺼내기
			}
		}
		if (bracket.isEmpty()) //다 끝내고 스택 비었으면 yes 아님 no
			return "yes";
		else
			return "no";
	}

}
