import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		String ans = "";
		int rest = 0;

		while (N > 0) {
			rest = N % B;
			if (rest >= 10)
				ans += (char) (rest - 10 + (int) 'A');
			else
				ans += (char) (rest + (int) '0');
			N /= B;
		}
		for (int i = ans.length() - 1; i >= 0; i--)
			System.out.print(ans.charAt(i));
	}

}
