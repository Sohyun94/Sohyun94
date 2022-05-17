package class2;

import java.util.Scanner;
// 이렇게 원론적인 방법으로 풀어도 되는 건가? 싶었는데
// 놀랍게도 시간 초과가 안 떴다
// 다른 풀이도 한번 읽어봐야겠다

public class B1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 받아주기 (몇 번쨰 666인지)
		int cnt = 0; // 몇 번째 666인지 세어줄 카운트
		String nnum = ""; // 정답
		// 666부터 첫 번째이므로 그냥 666부터 세어주기
		// int의 범위가 21억까지므로 이렇게 설정했다
		for(int i = 666; i < 2100000000; i++) {
			// contain 함수를 이용할 것이기 때문에 i를 문자열로 바꿔주었다
			nnum = String.valueOf(i);
			// 문자열에 666이 포함되어 있으면 카운트를 늘려준다
			if(nnum.contains("666")) {
				cnt++;
				// 그 카운트가 처음에 받은 숫자랑 같으면 for문 빠져나온다
				if(cnt == num)
					break;
			}
		}
		// 그 해당 nnum이 num 번째 666이 되는 정답이다
		System.out.println(nnum);
	}

}
