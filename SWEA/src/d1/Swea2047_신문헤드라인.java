package d1;

import java.util.Scanner;

public class Swea2047_신문헤드라인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] head = sc.next().toCharArray();
		for (int i = 0; i < head.length; i++) {
			if (97 <= head[i] && head[i] <= 122) {
				head[i] -= 32;
			}
		}
		for(int i = 0; i < head.length; i++) {
			System.out.print(head[i]);
		}

	}

}
