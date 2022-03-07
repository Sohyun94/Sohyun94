package if_else;

import java.util.Scanner;

public class C1229 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		double norm;
		if (h < 150)
			norm = h - 100;
		else if (150 <= h && h < 160)
			norm = (h - 150) / 2 + 50;
		else
			norm = (h - 100) * 0.9;
		double fat = (w - norm) * 100 / norm;
		if (fat <= 10)
			System.out.println("정상");
		else if (10 <= fat && fat <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");

	}

}
