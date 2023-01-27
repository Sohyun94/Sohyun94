import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon1744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int neg = 0; // 음수+0의 개수
		int ans = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] <= 0)
				neg++;
		}
		Arrays.sort(arr); // 정렬
		// 1. 음수가 짝수 개: 묶어서 더하기
		for (int i = 1; i < neg; i += 2)
			ans += arr[i - 1] * arr[i];

		// 2. 음수가 홀수 개: 가장 작은 음수(혹은 0은) 그냥 더하기
		if (neg % 2 != 0)
			ans += arr[neg - 1];

		// 3. 양수가 홀수 개: 가장 작은 양수 그냥 더하기
		if ((n - neg) % 2 != 0)
			ans += arr[neg];

		// 4. 남은 양수 그냥 더하기 or 묶어서 더하기 중 더 큰 값이 정답
		for (int i = n - 1; i > neg; i -= 2) {
			// 더하기
			int plus = arr[i] + arr[i - 1];
			// 곱하기
			int mul = arr[i] * arr[i - 1];
			if (plus >= mul)
				ans += plus;
			else
				ans += mul;
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.flush();
		bw.close();
	} // main

}
