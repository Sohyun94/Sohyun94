package Basic100;

import java.util.Scanner;

public class C1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] table = new int[19][19]; // 바둑판
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = sc.nextInt();
			}
		} // 바둑판 입력
		int n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			for (int i = 0; i < table.length; i++) {
				if (table[x][i] == 1) {
					table[x][i] = 0;
				} else {
					table[x][i] = 1;
				}
			}
			for (int j = 0; j < table.length; j++) {
				if (table[j][y] == 1) {
					table[j][y] = 0;
				} else {
					table[j][y] = 1;
				}
			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

}
