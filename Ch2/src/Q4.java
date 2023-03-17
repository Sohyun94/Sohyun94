import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소 값 개수: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			System.out.print("요소 값 입력: ");
			a[i] = sc.nextInt();
		}
		copy(a, b);
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			System.out.print(b[i] + " ");
		}

	}

	static void copy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
	}
}
