import java.util.Scanner;

public class B10870_피보나치수5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println(fibo(A));
	}

	private static int fibo(int A) {
		if (A == 0)
			return 0;
		if (A == 1)
			return 1;
		return fibo(A - 1) + fibo(A - 2);
	}

}
