import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while (T > 0) {
			boolean isValid = true;
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						isValid = false;
						break;
					}
				}
			}
			if (!stack.isEmpty())
				isValid = false;
			if (isValid)
				bw.write("YES\n");
			else
				bw.write("NO\n");
			T--;
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
