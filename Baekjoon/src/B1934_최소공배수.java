import java.util.Scanner;

public class B1934_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int A_share = 0;
			int B_share = 0;
			int max = 0;
			int ans = 1;
			for (int i = 2; i <= A * B; i++) {
				if (i != A && i != B && (A * B) % i == 0)
					break;
				else if (i == (A * B))
					System.out.println(A * B);
			}
			if (A == 1)
				System.out.println(B);
			else if (B == 1)
				System.out.println(A);
			else if (A > B) {
				for (int i = 2; i <= B; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						max = i;
					}
				}
				System.out.println(A_share * B_share * max);
			} else if (B > A) {
				for (int i = 2; i <= A; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						max = i;
					}
				}
				System.out.println(A_share * B_share * max);
			} else if (B == A)
				System.out.println(A);
		}
	}
}
