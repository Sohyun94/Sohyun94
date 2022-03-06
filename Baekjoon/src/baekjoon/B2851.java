package baekjoon;

import java.util.Scanner;

public class B2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 버섯이 10개니까 10칸짜리 배열 생성
		int arr[] = new int[10];
		// 합계
		int less = 0; // 100 전까지 더한 합계
		int more = 0; // 100 넘어서까지 더한 합계
		// 횟수 (버섯을 먹는)
		int count = 0;
		// 배열 마지막 도달하기 전까지 반복
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 버섯 먹은 횟수가 10보다 작고, 합계가 100보다 작을 떄 점수 더한 게 총합
		while (count < 10) {
			more = less + arr[count];
			if (more < 100) {
				less += arr[count];
			} else {
				break;
			}
			count++;
		}
		// more-100가 100-less보다 크면 less가 더 100에 가까우므로 less 출력
		if (more - 100 > 100 - less) {
			System.out.println(less);
		// 반대의 경우라면 more이 더 less애 가까우므로 less 출력
		} else {
			System.out.println(more);
		}

	}
}
