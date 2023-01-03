import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로
		int m = Integer.parseInt(st.nextToken()); // 가로
		// 조건 1. 방문한 칸의 수 최대
		// 조건 2. 이동 횟수가 4번 이상이라면 이동 방법을 모두 한 번씩 사용해야 함
		// 조건 3. 이동 방법: 2칸 위, 1칸 오른쪽 / 1칸 위, 2칸 오른쪽 / 1칸 아래, 2칸 오른쪽 / 2칸 아래, 1칸 오른쪽
		int ans = 1; // 본인이 있는 칸 포함하여 기본 방문 칸: 1
		if (n == 2) // 세로가 2일 때부터 이동 가능
			ans = Math.min((m + 1) / 2, 4);
		else if (n >= 3) {
			if (m < 7) { // 가로가 7을 넘어야 모든 이동 방법 사용 가능
				ans = Math.min(m, 4);
			} else {
				ans = m - 2;
			}
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.flush();
		bw.close();
	}

}
