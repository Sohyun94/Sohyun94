import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		long cnt_five = five(n) - five(n - m) - five(m);
		long cnt_two = two(n) - two(n - m) - two(m);

		System.out.println(Math.min(cnt_five, cnt_two));
	}

	private static int two(long x) {
		int cnt = 0;
		while (x >= 2) {
			cnt += x / 2;
			x /= 2;
		}
		return cnt;
	}

	private static int five(long x) {
		int cnt = 0;
		while (x >= 5) {
			cnt += x / 5;
			x /= 5;
		}
		return cnt;
	}

}
