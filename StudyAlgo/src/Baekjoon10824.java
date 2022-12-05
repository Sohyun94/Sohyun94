import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] num = new String[4];
		for (int i = 0; i < 4; i++) {
			num[i] = st.nextToken();
		}
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(num[0] + num[1]);
		long b = Long.parseLong(num[2] + num[3]);
		sb.append(a+b);
		System.out.println(sb);
	}

}
