<<<<<<< HEAD
=======
import java.io.BufferedReader;
import java.io.IOException;
>>>>>>> 61c09ff172a74fe61efd8fb59f1f2283da8f1831
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
=======
>>>>>>> 61c09ff172a74fe61efd8fb59f1f2283da8f1831

public class Baekjoon10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
<<<<<<< HEAD

		String[][] user = new String[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			user[i][0] = st.nextToken(); // 나이
			user[i][1] = st.nextToken(); // 이름

		}
		Arrays.sort(user, new Comparator<String[]>() {
=======
		String[][] per = new String[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			per[i][0] = st.nextToken();
			per[i][1] = st.nextToken();
		} // 받기

		Arrays.sort(per, new Comparator<String[]>() {
>>>>>>> 61c09ff172a74fe61efd8fb59f1f2283da8f1831

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
<<<<<<< HEAD

		});
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
			sb.append(user[i][0]).append(' ').append(user[i][1]).append('\n');

=======
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++)
			sb.append(per[i][0]).append(" ").append(per[i][1]).append('\n');
>>>>>>> 61c09ff172a74fe61efd8fb59f1f2283da8f1831
		System.out.println(sb);
	}

}
