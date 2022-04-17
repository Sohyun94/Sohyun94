
public class 분할정복01_거듭제곱_반복 {

	public static void main(String[] args) {
		int C = 2;
		int N = 10;

		System.out.println(power(C, N));
	}

	static int power(int C, int N) {
		int result = 1;
		for (int i = 1; i <= N; i++) {
			result *= C;
		}
		return result;
	}
}