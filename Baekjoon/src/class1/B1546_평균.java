package class1;

import java.util.Scanner;

public class B1546_평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum = 0;
		double max = 0;
		double[] score = new double[N];
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextDouble();
		}
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i])
				max = score[i];
		}
		double tmp_avg = sum / max / N * 100;
		System.out.println(tmp_avg);
	}

}
