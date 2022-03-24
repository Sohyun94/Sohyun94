package oneDimenArr;

import java.util.Scanner;

public class C1420 {

	public static void main(String[] args) {
		// 풀참
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[] = new String[n];
		int score[] = new int[n];
		for (int i = 0; i < n; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (score[j - 1] < score[j]) {
					int tmp = score[j - 1];
					score[j - 1] = score[j];
					score[j] = tmp;

					String tm = name[j - 1];
					name[j - 1] = name[j];
					name[j] = tm;
				}
			}
		} // for문 끝
		System.out.println(name[2]);

	}

}
