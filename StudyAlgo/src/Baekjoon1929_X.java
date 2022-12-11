import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1929_X {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int cnt = 0;
		int ans = 0;
		for (int k = 0; k < n; k++) {
			cnt = 0;
			outer: for (int i = m; i <= n; i++) {
				for (int j = 2; j <= n; j++) {
					if (i > j) {
						if (i % j == 0)
							cnt++;
						if (cnt > 1)
							break;
					} else if (i == j) {
						if (cnt == 1) {
							ans++;
							arr[k] = i;
							break outer;
						}
					} else {
						break;
					}
				}
			}
		}

		for (int i = 0; i < ans; i++) {
			bw.write(arr[i] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
