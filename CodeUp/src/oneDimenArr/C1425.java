package oneDimenArr;

import java.util.Scanner;

public class C1425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int stu[] = new int[N];
		for (int i = 0; i < N; i++) {
			stu[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if (stu[j - 1] > stu[j]) {
					int tmp = stu[j - 1];
					stu[j - 1] = stu[j];
					stu[j] = tmp;
				}
			}
		} // 정렬
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i] + " ");
			if ((i + 1) % C == 0) {
				System.out.println();
			}
		}
	}// main

}
