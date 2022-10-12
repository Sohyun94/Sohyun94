import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(s);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		sb.append((A + B) % C);
		sb.append("\n");
		sb.append(((A % C) + (B % C)) % C);
		sb.append("\n");
		sb.append((A * B) % C);
		sb.append("\n");
		sb.append(((A % C) * (B % C)) % C);
		System.out.println(sb);

	}

}
