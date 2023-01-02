import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10610 {
	// 30의 배수
	// 1. 끝자리가 0
	// 2. 각 자리 숫자 총합이 3의 배수
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String n = br.readLine();
		int[] num = new int[n.length()];
		int numSum = 0;
		for (int i = 0; i < n.length(); i++) {
			num[i] = n.charAt(i) - '0';
			numSum += num[i];
		}
		// 0 찾기 쉽게 정렬
		Arrays.sort(num);

		if (numSum % 3 == 0 && num[0] == 0) {
			for (int i = n.length() - 1; i >= 0; i--) {
				sb.append(num[i]);
			}
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}
	}

}
