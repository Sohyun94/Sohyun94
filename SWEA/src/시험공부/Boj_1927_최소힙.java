package 시험공부;

import java.io.*;
import java.util.*;

public class Boj_1927_최소힙 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int op = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < op; i++) {
			int x = Integer.parseInt(br.readLine());

			if (x == 0) {
				if (pq.isEmpty())
					System.out.println(0);
				else
					System.out.println(pq.poll());
			} else {
				pq.add(x);
			}
		}
	}
}