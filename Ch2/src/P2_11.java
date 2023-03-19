import java.util.Scanner;

public class P2_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 입력
		int no = 2; // 소수 개수
		int cnt = 0; // 연산 횟수
		int[] prime = new int[100000]; // 소수 배열
		prime[0] = 2;
		prime[1] = 3;
		for (int i = 5; i < num; i += 2) {
			boolean flag = false;
			for (int j = 1; prime[j] * prime[j] <= i; j++) {
				cnt += 2;
				if (i % prime[j] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				prime[no++] = i;
			}
		} // 소수 구하기 끝
		System.out.print("1부터 " + num + "까지의 소수는: ");
		for (int i = 0; i < no; i++) {
			System.out.print(prime[i] + " ");
		}
		System.out.println("\n소수의 개수: " + no);

	}

}
