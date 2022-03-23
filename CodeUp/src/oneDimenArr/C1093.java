package oneDimenArr;

import java.util.Scanner;

public class C1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stu[] = new int[23];
		for (int i = 0; i < n; i++) {
			// 입력받은 숫자 -1 한 배열의 인덱스에 숫자를 추가해 줌(0부터 시작하니까)
			stu[sc.nextInt() - 1]++;
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i] + " ");
		}

	}

}
