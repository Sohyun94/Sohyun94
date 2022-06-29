import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int prize = 0;
		if (a == b && a == c)
			prize = 10000 + a * 1000;
		else if (a == b && a != c)
			prize = 1000 + a * 100;
		else if (a == c && b != c)
			prize = 1000 + a * 100;
		else if (c == b && a != c)
			prize = 1000 + b * 100;
		else if (a != b && b != c) {
			if (a > b && a > c)
				prize = a * 100;
			else if (b > c && b > a)
				prize = b * 100;
			else
				prize = c * 100;
		}
		System.out.println(prize);

	}

}
