import java.util.Scanner;

public class Ch1_Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a, b);
	}

	static int sum(int a, int b) {
		int ans, max, min;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		ans = (min + max) * ((max - min) / 2);
		if ((max - min) % 2 != 0)
			ans += max + min;
		else
			ans += (max + min) / 2;
		System.out.println(ans);
		return ans;
	}
}
