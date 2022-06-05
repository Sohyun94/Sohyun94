package class2;

import java.util.Arrays;
import java.util.Scanner;

public class B1978_소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력받을 숫자 개수
		int[] num = new int[N]; // 입력하는 숫자 담아줄 배열
		int[] div = new int[N]; // 약수 개수 배열
		int ans = 0; // 정답
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		} // 입력 끝
		
		// 오름차순으로 정리
		Arrays.sort(num);
		
		// i 범위는 N까지
		for(int i = 0 ; i < N ; i++) {
			// 나눠 줄 j의 범위는 1부터 가장 큰 수 까지
			for(int j = 1; j <= num[N-1]; j++) {
				// 나머지가 0이면 약수 개수에 +해주고
				if(num[i] % j == 0)
					div[i]++;
				// 약수 개수 3 이상이면 어차피 소수 아니므로 다음 수 판별
					if(div[i] >= 3)
						break;
			}
		}// for문 닫기
		// 약수 배열에서 약수가 2개면 소수니까 정답에 더해주기 
		for(int i = 0; i < N; i++) {
			if(div[i] == 2)
				ans++;
		}
		System.out.println(ans);
	}

}
