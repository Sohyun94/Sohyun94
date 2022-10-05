import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2 * N; j++) {
				if (j < N) {
					if (j <= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j + i < 2 * N - 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		for (int i = N; i < 2 * N - 1; i++) {
			for (int j = 0; j < 2 * N; j++) {
				if (j < N) {
					if (j + i < 2 * N - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				if(j >= N) {
					if(j <= i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
