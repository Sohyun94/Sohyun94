package 시험공부;


import java.util.Scanner;

public class B15652_N과M4 {
	static int[] arr;
	static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 자연수
		M = sc.nextInt(); // 수열 길이 (M개 고름)
		arr = new int[M];
		perm(1, 0);

	}

	static void perm(int cnt, int idx) {
		// M과 같아질 때 출력(수열의 길이가 해당할 때)
		if (idx == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = cnt; i <= N; i++) { // 오름차순
			// arr의 해당 위치에 i 값 담기
			arr[idx] = i;
			// 중복 허용 되므로 i 값만 인자로 넘기면 됨
			perm(i, idx + 1);
		}
	}

}
