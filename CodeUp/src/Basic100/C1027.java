package Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1027 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String ss[] = str.split("\\.");
		String tmp = "";
		tmp = ss[0];
		ss[0] = ss[2];
		ss[2] = tmp;
		System.out.println(ss[0] + "-" + ss[1] + "-" + ss[2]);
	}
}
