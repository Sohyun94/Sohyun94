import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine()); // 색종이 수
		int ans = 0;
		boolean[][] white = new boolean[101][101]; // 도화지
		for (int paper = 0; paper < num; paper++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			// 좌표 체크해서 색칠 안 되어 있으면 색칠(true)하고 더하기
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					if (!white[i][j]) {
						white[i][j] = true;
						ans++;
					}
				}
			}
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.flush();
		bw.close();
	}

}
