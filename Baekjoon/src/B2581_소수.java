import java.util.Scanner;

public class B2581_소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		int cnt = 0;
		for (int i = M; i <= N; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					cnt++;
			}
			if (cnt == 0)
				arr[i] = i;
				System.out.println(arr[i]);
		}
//		for (int i = M; i <= N; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

}
