import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon9613 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < t; tc++) {
			long ans = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					if(i != j)
					ans += gcd(num[i], num[j]);
				}
			}
			bw.write(ans + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static long gcd(int i, int j) {
		if (j == 0) {
			return i;
		} else {
			return gcd(j, i % j);
		}
	}

}
