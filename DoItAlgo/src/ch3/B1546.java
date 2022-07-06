package ch3;

import java.util.Arrays;
import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Double[] score = new Double[N];
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextDouble();
		}
		Arrays.sort(score);
		Double sum = 0.0;

		Double[] newScore = new Double[N];
		for (int i = 0; i < N; i++) {
			newScore[i] = score[i] / score[N - 1] * 100;
			sum += newScore[i];
		}
		
		Double avg = sum / N;
		System.out.println(avg);

	}

}
