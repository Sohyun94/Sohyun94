package greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class B1715_카드정렬하기_우선순위큐 {
	public static void main(String[] args) {
		// 일반 배열로 풀 수 있을 거라고 생각했는데 도저히 안 되겠다 ^ㅅ^
		// 우선순위큐 이용하여 풀이
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		while(pq.size() > 1) {
			long first = pq.poll();
			long second = pq.poll();
			ans += first + second;
			pq.add(first + second);
		}
		System.out.println(ans);
	}
}
