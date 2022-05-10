package class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//comparator 사용에 좀 더 익숙해져야 할 듯싶다
public class B1181_단어정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 단어 개수

		String[] arr = new String[N];

		sc.nextLine(); // 개행 처리

		// 단어 받기
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextLine();

		// Comparator 활용
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 단어 길이 같으면 사전순
				if (o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();

			}
		}); // 정렬 끝
		System.out.println(arr[0]);

		// 같은 단어는 한 번만 출력
		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i - 1]))
				System.out.println(arr[i]);
		}
	}// main

}
