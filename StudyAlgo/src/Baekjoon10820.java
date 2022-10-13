import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		while ((s = br.readLine()) != null) {
			int[] cnt = new int[4];
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					cnt[0]++;
				else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					cnt[1]++;
				else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
					cnt[2]++;
				else if (s.charAt(i) == ' ')
					cnt[3]++;

			}
			for (int i : cnt)
				bw.write(i + " ");
			bw.write("\n");
			bw.flush();
		}

	}

}
