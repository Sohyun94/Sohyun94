package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class C1257 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nnum1 = Integer.parseInt(st.nextToken());
		int nnum2 = Integer.parseInt(st.nextToken());
		if (nnum1 % 2 == 0) { // 첫 입력 짝수일 때
			for (int i = nnum1 + 1; i <= nnum2; i += 2) {
				bw.write(i + " ");
			}
		} // if문
		else { // 첫 입력 홀수일 때
			for (int i = nnum1; i <= nnum2; i += 2) {
				bw.write(i + " ");
			}
		}
		bw.flush();
	}

}
