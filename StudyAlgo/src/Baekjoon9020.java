import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9020 {
	static boolean[] num = new boolean[10001]; // 자연수 배열
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		prime(); // 소수 구하기 메서드

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int half_one = n / 2; // 절반으로 나눈 앞부분
			int half_two = n / 2; // 절반으로 나눈 뒷부분

			while (true) {
				// 두 부분 다 소수일 때
				if (!num[half_one] && !num[half_two]) {
					sb.append(half_one).append(' ').append(half_two).append('\n');
					break;
				}
				half_one--;
				half_two++;
			}
		}
		System.out.print(sb);
	}

	// 에라토스테네스의 체 (맨날 까먹음...)
	// true: 소수 아님, false: 소수
	public static void prime() {
		// 0, 1 둘 다 소수 아님
		num[0] = num[1] = true;
		// 제곱근까지 검사
		for (int i = 2; i <= Math.sqrt(num.length); i++) {
			if (num[i])
				continue;
			for (int j = i * i; j < num.length; j += i)
				num[j] = true;
		}
	}
}
