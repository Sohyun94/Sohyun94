import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String stick = br.readLine();
		Stack<Character> stack = new Stack<>();
		int ans = 0;

		for (int i = 0; i < stick.length(); i++) {
			if (stick.charAt(i) == '(') {
				stack.push('(');
			} else if (stick.charAt(i) == ')') {
				stack.pop();
				if (stick.charAt(i - 1) == '(') {
					ans += stack.size();
				} else {
					ans++;
				}
			}
		}
		br.close();
		bw.write(ans + "\n");
		bw.flush();
		bw.close();
	}

}
