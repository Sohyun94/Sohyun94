package Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.printf("'%s'\n", c);
		}
	}
}
