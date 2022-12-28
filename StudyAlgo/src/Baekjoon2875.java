import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 여자
		int m = Integer.parseInt(st.nextToken()); // 남자
		int k = Integer.parseInt(st.nextToken()); // 참여 인원

		int team = 0;

		while (n >= 2 && m >= 1 && m + n >= 3 + k) {
			n -= 2;
			m -= 1;
			team++;
		}
		bw.write(String.valueOf(team));
		br.close();
		bw.flush();
		bw.close();
	}

}
