import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		do {
			System.out.print("a의 값: ");
			a = sc.nextInt();
			System.out.print("b의 값: ");
			b = sc.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		} while (b <= a);
		System.out.println("b - a는 " + (b - a) + "입니다.");

	}

}
