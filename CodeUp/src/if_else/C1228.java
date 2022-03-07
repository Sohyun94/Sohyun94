package if_else;

import java.util.Scanner;

public class C1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double norm = (height - 100) * 0.9;
		double fat = (weight - norm) * 100 / norm;
		if (fat <= 10)
			System.out.println("정상");
		else if (10 < fat && fat <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");
	}

}
