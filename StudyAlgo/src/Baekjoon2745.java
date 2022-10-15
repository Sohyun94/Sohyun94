import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int n = Integer.parseInt(st.nextToken());

		int x = 1;
		int ans = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);

			if ('A' <= c && c <= 'Z') {
				ans += (c - 'A' + 10) * x;
			} else {
				ans += (c - '0') * x;
			}
			x *= n;
		}
		System.out.println(ans);

	}
}