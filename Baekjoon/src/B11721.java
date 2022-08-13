import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alpha = sc.next().toCharArray();
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}

	}

}
