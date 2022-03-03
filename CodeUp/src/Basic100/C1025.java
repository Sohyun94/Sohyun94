package Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1025 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.print("[" + c);
			for(int j = str.length()-1 ; j > i ; j--) {
				System.out.print("0");
			}
			System.out.println("]");
		}
	}
}
