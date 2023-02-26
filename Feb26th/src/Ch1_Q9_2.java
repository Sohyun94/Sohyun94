import java.util.Scanner;

public class Ch1_Q9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sumof(a, b);
	}

	static int sumof(int a, int b) {
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}
}
