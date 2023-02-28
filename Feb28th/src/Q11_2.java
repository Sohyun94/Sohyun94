import java.util.Scanner;

public class Q11_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int ans = 0;
		do {
			System.out.println("양의 정수를 입력해 주세요.: ");
			System.out.println("입력 값: ");
			n = sc.nextInt();
		} while (n <= 0);

		while (n > 0) {
			n /= 10;
			ans++;
		}
		System.out.println(ans + "자리입니다.");
	}

}
