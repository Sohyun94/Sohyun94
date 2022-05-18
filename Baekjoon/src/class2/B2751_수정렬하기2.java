package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// O(n **2) 방식으로 하면 시간 초과가 떠서 다른 정렬로 풀어야 한다고 한다
public class B2751_수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int val : list)
			sb.append(val).append('\n');
		
		System.out.println(sb);
	}

}
