package class1;

import java.util.Scanner;

public class B2884_알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int min = sc.nextInt();
		if (min < 45) {
			if (time == 0) {
				min = (min + 60) - 45;
				time = 23;
			} else {
				min = (min + 60) - 45;
				time = time - 1;
			}
		} else
			min = min - 45;
		System.out.println(time + " " + min);
	}

}
