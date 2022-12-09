import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1168_시간초과 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) - 1;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i+1);

		int idx = 0;
		sb.append("<");
		for (int i = 0; i < n - 1; i++) {
			idx += k;
			if (idx >= list.size())
				idx %= list.size();
			sb.append(list.remove(idx) + ", ");
		}
		sb.append(list.remove(0) + ">");

		bw.write(sb.toString() + "\n");
		br.close();
		bw.flush();
		bw.close();
	}

}
