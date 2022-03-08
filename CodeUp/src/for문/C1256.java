package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1256 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		StringBuilder sb = new StringBuilder();
		int nnum = Integer.parseInt(num);
		for (int i = 1; i <= nnum; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
	}

}
