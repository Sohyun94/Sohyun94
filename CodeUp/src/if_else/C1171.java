package if_else;

import java.util.Scanner;

public class C1171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int classnum = sc.nextInt();
		int num = sc.nextInt();
		System.out.printf("%d%02d%03d", grade, classnum, num);

	}

}
