package 모의고사;

import java.util.ArrayList;

class Solution {
	public int[] solution(int[] answers) {
		// 첫 번째 수포자
		int[] first_ans = { 1, 2, 3, 4, 5 };
		// 두 번째 수포자
		int[] second_ans = { 2, 1, 2, 3, 2, 4, 2, 5 };
		// 세 번째 수포자
		int[] third_ans = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 처음 점수 전부 0으로 초기화
		int first_score = 0;
		int second_score = 0;
		int third_score = 0;

		// 0부터 정답 길이 전까지 늘어날 때
		for (int i = 0; i < answers.length; i++) {
			// 첫 번째 수포자 답안 주기 5개기 때문에 나머지 비교
			if (answers[i] == first_ans[i % 5])
				// 첫 번째 수포자 점수 더해주기
				first_score++;

			// 두 번째 수포자 (이하동문)
			if (answers[i] == second_ans[i % 8])
				second_score++;

			// 세 번째 수포자
			if (answers[i] == third_ans[i % 10])
				third_score++;
	}

			// 가장 높은 점수 구하기
			int best_score = Math.max(Math.max(first_score, second_score), third_score);

			// ArrayList 생성해서 best score들 기록
			ArrayList<Integer> list = new ArrayList<Integer>();
			if (best_score == first_score)
				list.add(1);
			if (best_score == second_score)
				list.add(2);
			if (best_score == third_score)
				list.add(3);

			// 정답 배열 (크기: 수포자들 점수 개수)
			int[] answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				// list에서 점수 가져오기
				answer[i] = list.get(i);
			}
		return answer;
	}
}
