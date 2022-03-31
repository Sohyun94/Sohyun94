import java.util.Scanner;

public class swea1232_사칙연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int node = sc.nextInt(); // 정점 수
			char[] op = new char[node + 1]; // 연산자 담을 배열
			int[] childL = new int[node + 1]; // 왼쪽 자식
			int[] childR = new int[node + 1]; // 오른쪽 자식
			int[] ans = new int[node + 1]; // 연산 결과 배열

			int idx = 0; // 위치 체크
			int end = 0; // 마지막 노드 체크

			sc.nextLine(); // 캐리지 리턴 버리기

			for (int i = 1; i <= node; i++) {
				String[] math = sc.nextLine().split(" "); // 문자열 배열에 공백 자르고 하나씩 담기
				idx = Integer.parseInt(math[0]); // 위치 배열 첫 번째로
				if (math.length == 4) { // 길이 4 되면
					op[idx] = math[1].charAt(0); // 연산자 담기
					childL[idx] = Integer.parseInt(math[2]); // 왼쪽 자식 담기
					childR[idx] = Integer.parseInt(math[3]); // 오른쪽 자식 담기
					end = idx; // end를 마지막 인덱스로
				} else {
					ans[idx] = Integer.parseInt(math[1]);
				}
			} // 정렬 끝
			for (int i = end; i >= 1; i--) {
				if (op[i] == '+') {
					ans[i] = ans[childL[i]] + ans[childR[i]];
				} else if (op[i] == '-') {
					ans[i] = ans[childL[i]] - ans[childR[i]];
				} else if (op[i] == '*') {
					ans[i] = ans[childL[i]] * ans[childR[i]];
				} else if (op[i] == '/') {
					ans[i] = ans[childL[i]] / ans[childR[i]];
				}
			}// 계산 끝
				System.out.println("#" + tc + " " + ans[1]);
		}//tc 
	}//main
}
