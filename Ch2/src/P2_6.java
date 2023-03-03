import java.util.Random;
import java.util.Scanner;

public class P2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열 요소 수: ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(500);
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		reverse(arr);

		System.out.println("배열 역순 정렬 완료.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
	}
}
