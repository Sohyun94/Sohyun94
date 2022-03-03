package Basic100;

import java.util.Scanner;

public class C1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		if (grade >= 90)
			System.out.println("A");
		else if (70 <= grade && 89 >= grade)
			System.out.println("B");
		else if (40 <= grade && 69 >= grade)
			System.out.println("C");
		else
			System.out.println("D");
	}

}
