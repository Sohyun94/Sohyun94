import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Baekjoon10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> adq = new ArrayDeque<>();

		while (N-- > 0) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {

			case "push_front": {
				adq.addFirst(Integer.parseInt(str[1]));
				break;
			}

			case "push_back": {
				adq.addLast(Integer.parseInt(str[1]));
				break;
			}

			case "pop_front": {
				if (adq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(adq.pollFirst()).append('\n');
				}
				break;
			}

			case "pop_back": {
				if (adq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(adq.pollLast()).append('\n');
				}
				break;
			}

			case "size": {
				sb.append(adq.size()).append('\n');
				break;
			}

			case "empty": {
				if (adq.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			}

			case "front": {
				if (adq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(adq.peekFirst()).append('\n');
				}
				break;
			}

			case "back": {
				if (adq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(adq.peekLast()).append('\n');
				}
				break;
			}
			}
		}
		System.out.println(sb);

	}

}
