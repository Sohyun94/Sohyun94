import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int time = 0;
		if (B + C < 60)
			System.out.println(A + " " + (B + C));
		else if (B + C >= 60) {
			time = (B + C) / 60;
			if (A + time >= 24) {
				System.out.println((A + time - 24) + " " + (B + C - (60 * time)));
			} else
				System.out.println((A + time) + " " + (B + C - (60 * time)));
		}
	}

}
