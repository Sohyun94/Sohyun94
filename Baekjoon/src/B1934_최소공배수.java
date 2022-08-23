import java.util.Scanner;

public class B1934_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A == 1)
				System.out.println(B);
			else if (B == 1)
				System.out.println(A);
			else
				if(A > B)
		}
	}
}
