import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N != 1) {
			for (int i = 2; i <= N; i++) {
				if (N % i == 0) {
					N = N / i;
					System.out.println(i);
					i = 1;
				}
			}
		}

	}

}
