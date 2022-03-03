package Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1023 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String ss[] = s.split("\\.");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
	}
}
