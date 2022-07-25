package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931_회의실배정3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int time[][] = new int[N][2];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		// compare 활용하기
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료 시간이 같을 경우 시작 시간이 빠른 순으로 정렬
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		// 정렬 끝
		int fin = 0; // 끝나는 시각
		for (int i = 0; i < N; i++) {
			// 끝나는 시각이 다음 회의 시작 시각보다 작거나 같으면 끝나는 시각 갱신
			if (fin <= time[i][0]) {
				fin = time[i][1];
				// 회의 수에 더해 주기
				cnt++;
			}
		}
		System.out.println(cnt);
	} // main
}
