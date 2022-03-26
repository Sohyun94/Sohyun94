package _220328;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class B1764_듣보잡 {

	public static void main(String[] args) {
		// 그냥 듣도 못한 명단+보도 못한 명단에서 겹치는 애들 찾아주면 될 듯?
		Scanner sc = new Scanner(System.in);
		int nhear = sc.nextInt(); // 듣도 못한 사람
		int nsee = sc.nextInt(); // 보도 못한 사람
		int nhearsee = 0; // 듣보잡 수

		HashSet<String> nh = new HashSet<>();
		ArrayList<String> nhs = new ArrayList<>();

		for (int i = 0; i < nhear; i++) {
			nh.add(sc.next()); // 듣도 못한 사람들 명단 넣기
		}

		for (int i = 0; i < nsee; i++) {
			String ns = sc.next(); // 보도 못한 사람들 명단 넣기
			if (nh.contains(ns)) { // 듣못 명단이 보못 명단이랑 겹치면
				nhs.add(ns); // 듣보잡 명단에 추가
				nhearsee++; // 듣보잡 숫자 증가
			}
		} // for문 끝

		Collections.sort(nhs); // 이름순 정렬
		System.out.println(nhearsee); // 듣보잡 수 출력
		for (int i = 0; i < nhs.size(); i++) {
			System.out.println(nhs.get(i)); // 듣보잡 꺼내기
		}

	}//main

}
