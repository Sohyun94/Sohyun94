import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int tc = 0; tc < T; tc++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int A_share = A;
			int B_share = B;
			int share = 1;
			if (A == 1 || B == 1) {
				System.out.println(A * B);
				continue;
			} else if (A == B) {
				System.out.println(A);
				continue;
			} else if (A > B) {
				for (int i = 2; i <= B; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						share = i;
					}
				}
			} else if (A < B) {
				for (int i = 2; i <= A; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						share = i;
					}
				}
			}
			System.out.println(A_share * B_share * share);
		}
	}

}
