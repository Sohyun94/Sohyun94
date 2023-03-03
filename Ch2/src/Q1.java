import java.util.Random;

public class Q1 {
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = 2 + r.nextInt(9);
		System.out.println("사람 수: " + num);
		int[] height = new int[num];
		for(int i = 0; i < height.length; i++) {
			height[i] = 100 + r.nextInt(90);
			System.out.println(i + "번째 사람의 키: " + height[i]);
		}
		System.out.println("가장 큰 키: " + maxOf(height));
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
