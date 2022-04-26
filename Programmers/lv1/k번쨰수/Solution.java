package k번쨰수;

import java.util.Arrays;

class Solution {

	public int[] solution(int[] array, int[][] commands) {
		// 리턴 값의 길이 = 커맨드 길이
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 값 새로 저장할 배열 길이
			// : 커맨드 배열의 두 번째 원소 - 첫 번째 원소 + 1
			int[] arr = new int[commands[i][1] - (commands[i][0] + 1)];
			int idx = 0;
			// 인덱스 하나씩 밀리니까 -1 한 것부터 시작
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				// 인덱스 하나씩 늘려가면서 정답 배열에 담아주기
				arr[idx++] = array[j];
			}
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2] - 1];
		}
		return answer;
	}
}
