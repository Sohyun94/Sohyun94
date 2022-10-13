import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {

	public static void main(String[] args) throws IOException {
		int[] alpha_idx = new int[26];
		for (int i = 0; i < alpha_idx.length; i++)
			alpha_idx[i] = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (alpha_idx[c - 'a'] == -1) {
				alpha_idx[c - 'a'] = i;
			}
		}
		for(int i = 0; i < alpha_idx.length; i++) {
			sb.append(alpha_idx[i]);
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
