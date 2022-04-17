import java.util.Arrays;

public class Permutation_swap {
	static int[] nums;
	static int N;

	public static void main(String[] args) {
		N = 3;

		nums = new int[] { 0, 1, 2 };
		
		perm(0);

	}// main

	// swap 메서드 구현
	// 인자로 배열과 바꿀 인덱스 2개를 넘길 건지, 인덱스 2개를 넘길 건지 결정
	// static하게 설정했으니 배열로 하지 않아도 ㅇㅋ
	static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}

	// idx: 내가 판단하는 위치
	static void perm(int idx) {
		if (idx == N) {
			System.out.println(Arrays.toString(nums));
			return;
		}

		// 자리를 바꾸면서 재귀 호출
		for (int i = idx; i < N; i++) {
			swap(i, idx);
			perm(idx + 1);
			swap(i, idx); //원상복구
		}
	}
}
