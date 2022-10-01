import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		for(int i = 0 ; i < s.length(); i++) {
			if(i != 0 && i % 10 == 0)
				sb.append("\n");
			sb.append(s.charAt(i));
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}
