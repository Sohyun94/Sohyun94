package greedy;

import java.util.Scanner;

public class B1439_뒤집기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.next().toCharArray();
		int oneCnt = 0;
		int zeroCnt = 0;

		if (num[0] == '0') {
			zeroCnt++;
		} else {
			oneCnt++;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] != num[i]) {
				if (num[i] == '0')
					zeroCnt++;
				else if (num[i] == '1')
					oneCnt++;
			}
		}
		System.out.println(Math.min(oneCnt, zeroCnt));
	}

}
