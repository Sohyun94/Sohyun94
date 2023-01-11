import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 미팅 시간 담을 배열
		int[][] meeting = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 미팅 시작과 종료 시간 담기
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}

		int ans = 0;

		// 미팅 종료 시간을 알아야 회의가 겹치지 않게 할 수 있기 때문에
		// 종료 시간 기준으로 정렬하기

		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료 시간이 같으면 시작 시간 순서로 정렬
				if (o1[1] == o2[1])
					return o1[0] - o2[0];
				return o1[1] - o2[1];
			}
		}); // 정렬 끝

		int lastMeeting = 0; // 이전에 끝난 미팅의 종료 시간

		// 이전 미팅 종료 시간이 다음 회의 시작 시간과 같거나 빠르면
		// 미팅 종료 시간을 바꿔 주고 회의 횟수에 더해주기
		for (int i = 0; i < n; i++) {
			if (lastMeeting <= meeting[i][0]) {
				lastMeeting = meeting[i][1];
				ans++;
			}
		}
		System.out.println(ans);

	}

}
