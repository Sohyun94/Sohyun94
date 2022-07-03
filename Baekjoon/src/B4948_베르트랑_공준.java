import java.util.Scanner;

public class B4948_베르트랑_공준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int ans = 0;
			int n = sc.nextInt();
			if (n == 0)
				break;
			for (int i = n + 1; i <= 2 * n; i++) {
				for (int j = n + 1; j < i; j++) {
					if (i % j == 0) {
						ans++;
					}
				}
			//	System.out.print(arr[i] + " ");
			}
			for (int i = n + 1; i <= 2 * n; i++) {
				//if (arr[i] == 1)
					ans++;
			}
			System.out.println(ans);
		}
	} // main
} // class
