import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요소 개수를 입력하세요.");
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[a.length];
		System.out.println("배열의 요소를 입력하세요.");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		rcopy(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			b[num - i - 1] = a[i];
		}

	}

}
