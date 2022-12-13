import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon11576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		int ten = 0;
		while (m-- > 0) {
			ten += Integer.parseInt(st.nextToken()) * Math.pow(a, m);
		}

		Stack<Integer> stack = new Stack<>();

		while (ten != 0) {
			stack.push(ten % b);
			ten /= b;
		}
		while (!stack.isEmpty()) {
			bw.write(stack.pop() + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
