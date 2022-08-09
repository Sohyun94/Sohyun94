package greedy;

import java.util.Scanner;

public class B1439_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.next().toCharArray();
		int oneCnt = 0;
		int zeroCnt = 0;
		int ans =0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == '1') {
				oneCnt++;
			} else {
				zeroCnt++;
			}
		}
		if(oneCnt > zeroCnt) {
			for(int i = 1; i < num.length; i++) {
				if(num[i] == '0' && num[i-1] != num[i])
					ans++;
			}
		} else {
			for(int i = 1; i < num.length; i++) {
				if(num[i] == '1' && num[i-1] != num[i])
					ans++;
			}
		}
		System.out.println(ans);
	}

}
