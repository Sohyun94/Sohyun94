import java.util.Scanner;

public class 최소공배수_최대공약수_유클리드_호제법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
		System.out.println(gcd2(a, b));
		System.out.println(lcm(a, b));
	}

	// 1. 반복문
	public static int gcd(int a, int b) {
		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	// 2. 재귀
	public static int gcd2(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// 3. 최소공배수 구하기
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
