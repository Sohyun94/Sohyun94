import java.util.Scanner;

public class B1934_최소공배수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int A_share = A;
			int B_share = B;
			int max = 1;
			int ans = 1;
			if (A == 1) {
				System.out.println(B);
				continue;
			}
			else if (B == 1) {
				System.out.println(A);
				continue;
			}
			else if (A == B) {
				System.out.println(A);
				continue;
			}
			else if (A > B) {
				for (int i = 2; i <= B; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						max = i;
					}
				}
			} else if(B > A) {
				for (int i = 2; i <= A; i++) {
					if (A % i == 0 && B % i == 0) {
						A_share = A / i;
						B_share = B / i;
						max = i;
					}
				}
			}
			System.out.println(A_share * B_share * max);
		}
	}
}
