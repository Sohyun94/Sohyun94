import java.util.Scanner;

public class SolveMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(max);

	}

}
