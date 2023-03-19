import java.util.Scanner;

public class P2_11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.: ");
		int num = sc.nextInt(); // 숫자 범위
		int primeNum = 2; // 소수 개수 (2, 3 제외하기 때문에 2부터 시작)
		int[] prime = new int[100000]; // 소수 배열

		// 2와 3은 소수
		prime[0] = 2;
		prime[1] = 3;

		// 다음 소수인 5부터 시작, 짝수는 검증할 필요 없으므로 2씩 증가
		for (int i = 5; i <= num; i += 2) {
			boolean flag = false;
			for (int j = 1; prime[j] * prime[j] <= i; j++) {
				if (i % prime[j] == 0) {
					flag = true;
					break;
				}
			}
			// i까지 나눴는데 안 나눠지면 그 수는 소수
			if (!flag) {
				prime[primeNum++] = i;
			}
		} // 소수 구하기 끝
		System.out.println("1부터 " + num + "까지의 소수는 ");
		for (int i = 0; i < primeNum; i++) {
			System.out.print(prime[i] + " ");
		}
		System.out.println("\n가 있으며, 총 개수는 " + primeNum + "개입니다.");
	}

}
