import java.util.Scanner;

public class P2_10_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 나눗셈 횟수
		int num = 0; // 소수 개수
		int[] prime = new int[100000]; // 소수 저장할 배열
		System.out.println("숫자를 입력하세요.");
		int no = sc.nextInt();
		// 최초의 소수는 2
		prime[num++] = 2;

		// 2를 제외한 짝수는 소수가 아니므로 홀수 중에서 구해 주기
		for (int i = 3; i <= no; i += 2) {
			int j;
			for (j = 0; j < num; j++) {
				cnt++;
				// 나누어지면 소수가 아니므로 반복문 빠져나가기
				if (i % prime[j] == 0)
					break;
			}
			// 둘이 같아지면 소수니까 배열에 집어 넣기
			if (num == j)
				prime[num++] = i;
		}
		System.out.println("1부터 " + no +"까지 소수는");
		for(int i = 0; i < num; i++) {
			System.out.print(prime[i] + " ");
		}
		System.out.println("\n이며, 소수의 개수는 " + num + "개이고, 나눗셈을 총 " + cnt +"번 진행하였다.");
	}

}
