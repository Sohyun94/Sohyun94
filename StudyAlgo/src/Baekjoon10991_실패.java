import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10991_실패 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= 2 * (N - 1); j++) {
				if (i == 0) {
					if (j == N - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				if (i != 0) {
					if (N % 2 == 0) {
						if (i % 2 != 0) {
							if (i == N - 1) {
								System.out.print("*");
							} else
								System.out.print(" ");
						}

					} else if (N % 2 != 0) {

					}
				}
			}
		}
	}

}