import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1934_X {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if (A == 1 || B == 1) {
				System.out.println(A * B);
			} else if (A == B)
				System.out.println(A);
			else {
				int x = 0;
				if (A >= B) {
					for (int i = 1; i <= B; i++) {
						if (A % i == 0 && B % i == 0) {
							A /= i;
							B /= i;
							x = i;
						} else {
							System.out.println((long) (A * B * x));
							break;
						}
					}
				} else {
					for (int i = 1; i <= A; i++) {
						if (A % i == 0 && B % i == 0) {
							A /= i;
							B /= i;
							x = i;
						} else {
							System.out.println((long) (A * B * x));
							break;
						}
					}
				}
			}
		}
	}

}
