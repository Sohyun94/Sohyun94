import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		String[] binaryOct = { "000", "001", "010", "011", "100", "101", "110", "111" };
		int len = str.length();

		if (len == 1 && str.charAt(0) == '0')
			sb.append(0);
		else {
			for (int i = 0; i < len; i++) {
				int n = Character.getNumericValue(str.charAt(i));
				if (i == 0 && n < 4) {
					switch (n) {
					case 1:
						sb.append("1");
						break;

					case 2:
						sb.append("10");
						break;

					case 3:
						sb.append("11");
						break;
					}
				} else
					sb.append(binaryOct[n]);

			}
		}
		System.out.println(sb.toString());
	}
}
