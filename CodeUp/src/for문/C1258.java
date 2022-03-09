package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C1258 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = bf.readLine();
		int nnum = Integer.parseInt(num);
		int sum = 0;
		for (int i = 2; i <= nnum; i += 2) {
			sum += i;
			bw.write(sum);
		}
		bw.flush();
	}

}
