package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B2217_로프 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int[] rope = new int[N];
		for(int i = 0; i < N; i++) {
			rope[i] = sc.nextInt();
		}
		Arrays.sort(rope);
		// 가장 작은 무게 버틸 수 있는 로프 * 로프 개수 = 최대 하증
		for(int i = N -1 ; i >= 0; i--) {
			rope[i] = rope[i] * (N - i);
			if(max < rope[i])
				max = rope[i];
		}
		System.out.println(max);
	}

}
