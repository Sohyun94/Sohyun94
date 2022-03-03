package Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] time = str.split(":");
		if (time[1].equals("00")) {
			System.out.println(0);
		}
		else {
			System.out.println(time[1]);
		}
	}
}
