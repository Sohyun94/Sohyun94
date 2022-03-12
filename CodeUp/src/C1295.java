import java.util.Scanner;

public class C1295 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alpha = sc.next().toCharArray();
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] >= 65 && alpha[i] <= 90)
				alpha[i] += 32;
			else if (alpha[i] >= 97 && alpha[i] <= 122)
				alpha[i] -= 32;
			else
				continue;

		} // for문
		System.out.println(alpha);

	}

}
