import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		// 정렬
		Collections.sort(list);
		
		for(int ans : list)
			sb.append(ans).append('\n');
		
		System.out.println(sb);
	}

}
