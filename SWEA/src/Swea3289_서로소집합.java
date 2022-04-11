import java.util.Scanner;

public class Swea3289_서로소집합 {
	static int[] arr;
	static int n; // n 이하 자연수
	static int m; // 연산 개수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int[n + 1]; // 각 집합 부모 담을 배열

			makeSet();

			System.out.print("#" + tc + " ");

			for (int i = 0; i < m; i++) {
				int op = sc.nextInt(); //연산자
				int a = sc.nextInt(); // 두 수
				int b = sc.nextInt();

				if (op == 1) {// 합집합이 아니면
					int A = findSet(a);
					int B = findSet(b);
					if (A == B)
						System.out.print(1);
					else
						System.out.print(0);
				} else
					unionSet(a, b);
			}
			System.out.println();
		} // tc
	} // main

	private static boolean unionSet(int a, int b) {
		int pA = findSet(a);
		int pB = findSet(b);

		if (pA == pB)
			return false;
		arr[pB] = pA;
		return true;

	}

	private static int findSet(int a) {
		if (arr[a] == a)
			return a;
		return arr[a] = findSet(arr[a]);
	}

	private static void makeSet() {
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}

	}

}
