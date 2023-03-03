import java.util.Scanner;

public class Q15 {
	// 직각 이등변 삼각형 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 삼각형을 만들 건가요?");
		System.out.print("단 수: ");
		int n = sc.nextInt();
		trianglLB(n);
		triangleLU(n);
		triangleRU(n);
		tringleRB(n);
	}

	static void trianglLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	static void tringleRB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
