import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Baekjoon10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[][] user = new String[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			user[i][0] = st.nextToken(); // 나이
			user[i][1] = st.nextToken(); // 이름

		}
		Arrays.sort(user, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}

		});
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
			sb.append(user[i][0]).append(' ').append(user[i][1]).append('\n');

		System.out.println(sb);
	}

}
