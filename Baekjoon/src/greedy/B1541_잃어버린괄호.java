package greedy;

import java.util.Scanner;

public class B1541_잃어버린괄호 {
	//포인트는 덧셈 연산을 먼저 하고 그 다음에 뺄셈 연산 하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		
		// 뺄셈 연산 기준으로 나눠서 받아 주기
		// 뺄셈 앞에 있는 것들은 더해 줄 거니까
		String[] sub = sc.nextLine().split("-");
		
		for(int i = 0; i < sub.length; i++) {
			int sum = 0;
			
			// 위에서 뺄셈 기준으로 나뉜 연산들 다시 덧셈으로 분리하기
			String[] add = sub[i].split("\\+");
			// 더해 주기
			for(int j = 0; j < add.length; j++) {
				sum += Integer.parseInt(add[j]);
			}
			// 처음 들어온 애가 첫 값이라면 음수가 아니라 양수
			if (min == Integer.MAX_VALUE) {
				min = sum;
			// 빼 주기
			} else {
				min -= sum;
			}
		} // 연산 끝
		System.out.println(min);

	}

}
