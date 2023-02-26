import java.util.Scanner;

public class Ch1_Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if (n % 2 == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = (2 + n) * (n + 1) / 2 - (n + 1);
		}
		System.out.println(sum);
	}

}
