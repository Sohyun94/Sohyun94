import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Baekjoon6588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[1000001];

		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {
				for (int j = i * 2; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}

		while (true) {
			int num = Integer.parseInt(br.readLine());
			boolean ans = false;

			if (num == 0) {
				System.out.println(sb);
				return;
			}

			for (int i = 3; i <= num; i += 2) {
				if (!prime[i] && !prime[num - i]) {
					sb.append(num + " = " + i + " + " + (num - i)).append("\n");
					ans = true;
					break;
				}
			}

			if (!ans)
				sb.append("Goldbach's conjecture is wrong.").append("\n");
		}
	}

}
