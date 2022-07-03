import java.util.Scanner;

public class B4948_베르트랑_공준2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int ans = 0;
			int n = sc.nextInt();
			if (n == 0)
				break;
			boolean check = false;

			for (int i = n + 1; i <= 2 * n; i++) {
				for (int j = 2; j < (int) Math.sqrt(i) + 1; j++) {
					if (i % j == 0) {
						check = true;
						break;
					}
				}
				if (!check) {
					ans++;
				}
				check = false;
			}
			System.out.println(ans);
		}
	} // main
} // class
