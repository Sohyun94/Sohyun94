import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		npira(n);
	}

	static void npira(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1)
					System.out.print((i+1) % 10);
				else
					System.out.print(" ");
			}
			for (int j = n; j < 2 * n - 1; j++) {
				if(j - i<= n - 1)
					System.out.print((i+1) % 10);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
