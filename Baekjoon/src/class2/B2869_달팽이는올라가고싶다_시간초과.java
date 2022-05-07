package class2;

import java.util.Scanner;

public class B2869_달팽이는올라가고싶다_시간초과 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt(); // 올라가는 길이
		int down = sc.nextInt(); // 내려가는 길이
		int length = sc.nextInt(); // 나무 막대 길이
		int day = 0; // 달팽이가 막대 전부 올라가는 데 소요되는 날
		//while문 반복
		while (true) {
			// 길이에서 올라간 만큼 빼기
			length = length - up;
			// 하루 더해주기
			day++;
			// 길이가 0보다 크면, 즉, 아직 올라갈 길이가 남았으면
			if (length > 0) {
			// 밤에 미끄러짐
				length = length + down;
				// 아니면 밤에 내려올 이유가 없으므로
			} else {
				// while문 빠져나가기
				break;
			}
		}
		System.out.println(day);
	}

}
