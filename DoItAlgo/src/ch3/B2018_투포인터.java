package ch3;

import java.util.Scanner;

// 투 포인터란?
// 2개의 포인터로 알고리즘 시간 복잡도 최적화

// 투 포인터 이동 원칙
// 1. sum > N
// sum = sum - start_index;
//	start_index++;
// 2. sum < N
// end_index++;
// sum = sum + end_index;
// 3. sum == N
// end_index++;
// sum = sum + end_index;
// cnt++;

//[슈도 코드]
//사용 변수 초기화 (cnt = 1, start_index = 1, end_index =1, sum = 1)
//while(end_index != N) {
//	if(sum == N) {
//		cnt++;
//		end_index++;
//		sum 변화
//	}
//	else if (sum > N) {
//		sum 변화
//		start_index++;
//	}
//	else if (sum < N) {
//		end_index++;
//		sum 변화
//	}
//	cnt 출력
//}
public class B2018_투포인터 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int st_idx = 1;
		int ed_idx = 1;
		int sum = 1;
		while (ed_idx != N) {
			if (sum == N) {
				cnt++;
				ed_idx++;
				sum = sum + ed_idx;
			} else if (sum > N) {
				sum = sum - st_idx;
				st_idx++;
			} else if (sum < N) {
				ed_idx++;
				sum = sum + ed_idx;
			}
		}
		System.out.println(cnt);
	}

}
