import java.util.Random;
import java.util.Scanner;

public class P2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("키 최댓값 구하기");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		int[] height = new int[num];

		System.out.println("각 사람의 키입니다.");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + r.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		System.out.println("가장 큰 키는 " + maxOf(height) + "입니다.");
	}

	static int maxOf(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
