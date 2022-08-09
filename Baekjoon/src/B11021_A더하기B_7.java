import java.util.Scanner;

public class B11021_A더하기B_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0 ; tc < T; tc++) {
			int result = sc.nextInt() + sc.nextInt();
			System.out.println("Case #" + (tc+1) + ": " + result);
		}

	}

}
