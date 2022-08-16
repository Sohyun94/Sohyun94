import java.util.Scanner;
import java.util.Stack;

public class B9012_괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int len = str.length();

			for (int j = 0; j < len; j++) {
				char c = str.charAt(j);

				if (c == '(')
					st.push(c);
				else {
					int size = st.size();
					if (size == 0) {
						st.push(c);
						break;
					} else {
						st.pop();
					}
				}
			}
			if (st.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			st.clear();
		}
	}

}
