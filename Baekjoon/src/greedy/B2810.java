package greedy;

import java.util.Scanner;

public class B2810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;

		for (int i = 0; i < num; i++) {
			char seats = sc.next().split("").charAt(i);
			if (seats == 'S')
				cnt++;
			else if (seats == 'L') {
				cnt++;
				i++;
			}
		}
		System.out.println(cnt);
	}

}
