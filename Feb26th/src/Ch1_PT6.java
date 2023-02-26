import java.util.Scanner;

public class Ch1_PT6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("n 값 입력: ");
			n = sc.nextInt();
		} while (n <= 0);

		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		System.out.println("총합: " + sum);
	}

}
