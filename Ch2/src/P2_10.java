
public class P2_10 {
	public static void main(String[] args) {
		int cnt = 0; // 나눗셈 횟수
		int num = 0; // 소수 개수
		int[] prime = new int[500]; // 소수 저장하는 배열

		prime[num++] = 2; // 2는 소수니까 저장

		// 짝수는 2를 빼고 모두 소수가 아니므로 홀수 중에서 찾기
		for (int i = 3; i <= 1000; i += 2) {
			int j;
			// 소수로 나누기
			for (j = 0; j < num; j++) {
				cnt++;
				if (i % prime[j] == 0)
					break;
			}
			if (num == j)
				prime[num++] = i;
		}
		for (int i = 0; i < num; i++) {
			System.out.print(prime[i] + " ");
		}
		System.out.println("\n나눗셈 횟수: " + cnt);
	}
}
