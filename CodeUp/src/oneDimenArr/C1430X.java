package oneDimenArr;

import java.util.Scanner;

public class C1430X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int quest[] = new int[M];
		for (int i = 0; i < M; i++) {
			quest[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			 for (int j = 0; j < M; j++) {
				if (quest[j] == num[i]) {
					cnt++;
				}

			}
			System.out.print(cnt);
		}

	}
}
