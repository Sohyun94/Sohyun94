import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			// push 연산: 숫자 스택에 넣기
			case "push":
				stack.push(Integer.parseInt(str[1]));
				break;
			// pop 연산: top에 있는 정수 빼고 출력
			// stack이 비어 있으면 -1 출력
			case "pop":
				if (stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.pop() + "\n");
				break;
			// size 연산: 스택에 들어 있는 정수 개수 출력
			case "size":
				bw.write(stack.size() + "\n");
				break;
			// empty 연산: stack이 비어 있으면 1 출력
			case "empty":
				if (stack.empty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			// peek 연산: 스택 가장 위 정수 출력
			case "top":
				if (stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.peek() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

}
