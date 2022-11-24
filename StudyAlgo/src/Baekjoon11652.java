import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon11652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long [] card = new long[N];
		for(int i = 0; i < N ;i ++) {
			card[i] = Long.parseLong(br.readLine());
		}
		br.close();
		
		Arrays.sort(card);
		int cnt = 1;
		int maxCnt = 1;
		int maxIdx = 0;
		
		for(int i = 1; i < N; i++) {
			if(card[i-1] == card[i]) {
				cnt++;
			} else {
				cnt = 1;
			}
			if(cnt > maxCnt) {
				maxCnt = cnt;
				maxIdx = i;
			}
		}
		bw.write(card[maxIdx]+"\n");
		bw.flush();
		bw.close();
	}

}
