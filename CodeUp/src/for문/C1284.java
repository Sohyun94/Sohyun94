package for문;

import java.util.ArrayList;
import java.util.Scanner;

public class C1284 {
	// 소수를 어떻게 구해야 할지 모르겠어서 풀이 참고함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받은 정수
		boolean flag = true;
		ArrayList<Integer> prime = new ArrayList<>();
		while (flag) { // 2부터 나눠 주면 되니까
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					prime.add(i);
					n /= i; // i로 나눠 준 값을 위에 넣어야 되니까
					i = 1; // i는 1로 초기화
					continue;
				}
			} // for문
			if (n == 1) // 1이 되면 더 나눌 게 없으니까
				break;
		} // while문
		if (prime.size() == 2) { //2면 소수와 소수의 곱임
			System.out.println(prime.get(0) + " " + prime.get(1));
		} else {
			System.out.println("wrong number");
		}
	}// main
}