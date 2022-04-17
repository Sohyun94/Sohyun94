
public class 분할정복02_거듭제곱_재귀 {

	public static void main(String[] args) {
		int C = 2;
		int N = 15;

		System.out.println(power2(C, N));

	} // main

	// C: 밑수, N: 지수
	static int power(int C, int N) {
		if (N == 1)
			return C;

//		int result;

		// 짝수일 때
		if (N % 2 == 0) {
			return power(C, N / 2) * power(C, N / 2);
			// 홀수일 때
		} else {
			return power(C, (N - 1) / 2) * power(C, (N - 1) / 2) * C;
		}
	}

	// C: 밑수, N: 지수
	static int power2(int C, int N) {
		if (N == 1)
			return C;

		int result;

		// 짝수일 때
		if (N % 2 == 0) {
			result = power(C, N / 2);
			return result * result;
			// 홀수일 때
		} else {
			result = power(C, (N - 1) / 2);
			return result * result * C;
		}
	}

}
