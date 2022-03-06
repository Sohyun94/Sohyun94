package if_else;

import java.util.Scanner;

public class C1170 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int classnum = sc.nextInt();
		int num = sc.nextInt();
		if (num >= 10)
			System.out.println(grade + "" + classnum + "" + num);
		else
			System.out.println(grade + "" + classnum + "0" + num);

	}

}
