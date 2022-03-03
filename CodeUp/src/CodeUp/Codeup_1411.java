package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup_1411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//N이 최대 50이므로, 1차원 배열 50개
		int[] card = new int[50];
		
		//카드 뽑기
		for(int i = 0; i < a-1; i++) {
			card[i] = sc.nextInt();
		}
		//카드 0부터 a-1까지 정렬
		Arrays.sort(card, 0, a-1);
		for(int i = 0 ; i < a; i++) {
		// 1. 정렬한 카드의 i번째가 i+1이 아님 or
		// 2. 카드의 i번째가 0임 -> i+1 출력
			if(card[i] != i+1 || card[i] == 0) {
				System.out.println(i+1);
				break;
			}
		}
		

	}

}
