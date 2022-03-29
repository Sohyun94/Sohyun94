package _220328;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Comparator 활용이 낯설어서,, 검색하며 해결함 
public class B10814_나이순정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력받을 회원 수
		String[][] member = new String[N][2]; // 나이, 이름 받을 배열

		for (int i = 0; i < N; i++) { // 명단 입력받기
			member[i][0] = sc.next(); // 나이(나이순 -> 나이 같으면 가입순)
			member[i][1] = sc.next(); // 이름

		} // 입력 끝

		Arrays.sort(member, new Comparator<String[]>() {
			@Override // 오버라이드 만들기, 나이순 정렬
			// 비교할 인자 두 개 -> 각 멤버의 나이 (member1[0] = member[0][0], member2[0] = member[1][0])
			public int compare(String[] member1, String[] member2) {
				if (member1[0] == member2[0]) { // 나이가 같으면 가입순
					return 1; // 양수값 리턴이면 앞 인자가 먼저 정렬이므로~
				} else { // 아니면 둘이 뺀 값으로 정렬
				//첫 번째가 크면 리턴값 양수(전자 먼저 정렬), 두 번째가 더 크면 리턴값 음수(후자 먼저 정렬)
					return Integer.parseInt(member1[0]) - Integer.parseInt(member2[0]);
				}
			}

		}); // 정렬 끝
		for (int i = 0; i < N; i++) { //나이			//이름
			System.out.println(member[i][0] + " " + member[i][1]);
		}
	}// main

}
