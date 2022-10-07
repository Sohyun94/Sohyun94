import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j = N; j < 2 * N - i; j++) {
				if (i + j < 2 * N - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = N; i < 2 * N - 1; i++) {
			for (int j = 0; j < N; j++) {
				if (i + j < 2 * N - 2 )
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j = N; j <= i; j++) {
				if(i >= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
