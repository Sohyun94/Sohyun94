import java.util.Scanner;

public class Ch1_Q8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum(n);

	}

	static int sum(int n) {
		int sum;
		sum = (1 + n) * (n / 2);
		if (n % 2 != 0) {
			sum += (n + 1) / 2;
		}
		System.out.println(sum);
		return sum;
	}

}
