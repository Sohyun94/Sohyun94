import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단인지 입력하세요. ");
		int n = sc.nextInt();
		spira(n);
	}

	static void spira(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = n; j < 2 * n - 1; j++) {
				if (j - i < n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}