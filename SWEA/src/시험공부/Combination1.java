import java.util.Arrays;

public class Combination1 {
	static int[] data; // 정수형 자료형 모임
	static int[] sel; // 내가 뽑은 것들 저장할 배열
	static int N, R; // N개 중 R개 뽑자

	public static void main(String[] args) {
		data = new int[] { 10, 11, 12, 13, 14 };
		N = 5;
		R = 3;
		sel = new int[R]; // R개 값 저장할 배열
		comb(0, 0);
		// 5C3 =?
	}// main

	// idx: 실제 데이터 배열 인덱스, sidx: sel 배열의 인덱스
	static void comb(int idx, int sidx) {
		if (sidx == R) {
			// 전부 뽑아서 sel 배열 다 채움
			System.out.println(Arrays.toString(sel));
		} else if (idx == N) {
			// 다 뽑지 못했는데 더 이상 넣을지 말지 판단할 원소가 없다
			return;
		} else {
			sel[sidx] = data[idx];
			comb(idx + 1, sidx + 1); // 뽑고 가기
			// 덮어 씌워져서 중간에 처리할 필요 없음
			comb(idx + 1, sidx); // 안 뽑고 가기
		}

		
		//위랑 같은 코드
		if (sidx == R) {
			// 전부 뽑아서 sel 배열 다 채움
			System.out.println(Arrays.toString(sel));
			return;
		}
		if (idx == N) {
			// 다 뽑지 못했는데 더 이상 넣을지 말지 판단할 원소가 없다
			return;
		}
		sel[sidx] = data[idx];
		comb(idx + 1, sidx + 1); // 뽑고 가기
		// 덮어 씌워져서 중간에 처리할 필요 없음
		comb(idx + 1, sidx); // 안 뽑고 가기
	}

}
