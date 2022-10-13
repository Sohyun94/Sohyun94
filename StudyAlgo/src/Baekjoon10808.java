import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10808 {

	public static void main(String[] args) throws IOException {
		int[] alpha_cnt = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		for(int i = 0 ; i < s.length(); i++) {
			alpha_cnt[(int) s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < alpha_cnt.length; i++) {
			sb.append(alpha_cnt[i]);
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
