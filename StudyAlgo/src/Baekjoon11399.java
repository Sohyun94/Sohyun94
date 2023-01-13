import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int man = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] line = new int[man];
		for (int i = 0; i < man; i++) {
			line[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(line);

		int waiting = 0; // 대기 시간
		int ans = 0;

		for (int i = 0; i < line.length; i++) {
			ans += waiting + line[i];
			waiting += line[i];
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.flush();
		bw.close();
	}

}
