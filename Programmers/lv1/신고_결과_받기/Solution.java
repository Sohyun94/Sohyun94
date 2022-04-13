package 신고_결과_받기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// 프로그래머스 첫 공부인데 감이 안 잡혀서 유튜브 보고 설명 들으며 따라치기 해 봤다
// 다음에 다시 풀어야지 (출처 : https://youtu.be/ncCUNOJUn9Q)

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		// 1. 중복 제거 (여러 번 신고한 경우 횟수가 아닌 상태가 누적됨)
		HashSet<String> reportSet = new HashSet<String>();
		for (String rep : report)
			reportSet.add(rep);
		// 2. 신고자와 신고당한 사람 나눠서 정리
		HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
		// 중복이 제거된 상태에서 다시 꺼내 오기
		for (String rep : reportSet) {
			int blankIdx = rep.indexOf(" ");
			String reporter = rep.substring(0, blankIdx);
			String reportee = rep.substring(blankIdx + 1);
			// 신고자 관리
			// 신고당한 사람이 있으면 이름을 가져오고, 아니면 null 값 반환
			ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
			if (reporterList == null)
				reporterList = new ArrayList<>();
			// 지금 리포트한 사람을 추가
			reporterList.add(reporter);
			notifyListHash.put(reportee, reporterList);
		}
		// 3. 신고자 정리
		HashMap<String, Integer> reporterHash = new HashMap<>();
		// values = arrayList 얘네를 하나씩 꺼내 오기
		for(ArrayList<String> notifyList : notifyListHash.values())
			// list에서 하나 가져왔을 때 size가 k 이상이면 notifyList에 있는 reporter들에게 신고 결과 전달
			if(notifyList.size() >= k)
				//notifyList에서 신고한 사람들을 하나씩 꺼내 와서
				for(String reporter : notifyList)
					//reporterHash에 값 누적, 기존 값 가져오거나 기존 값 없었다면
					//0에다 1을 더해서 다시 reporterHash에 누적
					reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
		// 4. 신고자 정리 후 정답 배열 넣기
		for(int i = 0; i < id_list.length; i++)
			// 신고자 아이디 가져오기 없으면 0으로
			answer[i] = reporterHash.getOrDefault(id_list[i], 0);
		return answer;
	}
}