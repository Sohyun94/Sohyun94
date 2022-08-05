package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int ans = 1; // 정렬 첫 번째는 무조건 채용
			int[][] people = new int[N][2];
			for (int i = 0; i < N; i++) {
				people[i][0] = sc.nextInt();
				people[i][1] = sc.nextInt();
			}
			// 서류 기준으로 정렬
			Arrays.sort(people, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			int grade = people[0][1];
			for(int i = 1; i < N; i++) {
				if(people[i][1] < grade) {
					grade = people[i][1];
					ans++;
				}
			}
			System.out.println(ans);
		} // tc

	} // main

}
