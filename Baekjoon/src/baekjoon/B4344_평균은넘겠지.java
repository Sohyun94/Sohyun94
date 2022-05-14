package baekjoon;

import java.util.Scanner;

public class B4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 수
		for (int tc = 1; tc <= T; tc++) {
			double sum = 0; // 성적 총합
			double avg = 0; // 평균
			double cnt = 0; // 평균 넘는 학생 수
			int stu = sc.nextInt(); // 학생 수
			double[] grade = new double[stu]; // 성적 배열
			for (int i = 0; i < stu; i++) {
				grade[i] = sc.nextDouble();
			}
			for (int i = 0; i < stu; i++) {
				sum += grade[i];
			}
			avg = sum / stu;
			for (int i = 0; i < stu; i++) {
				if (grade[i] > avg)
					cnt++;
			}
			double ans = 100 * cnt / stu;
			System.out.printf("%.3f%%\n", ans);
		} // tc

	} // main

}
