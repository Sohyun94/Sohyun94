import java.util.Scanner;

public class P2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소 개수: ");
		int aNum = sc.nextInt();
		int[] a = new int[aNum];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("배열 b의 요소 개수: ");
		int bNum = sc.nextInt();
		int[] b = new int[bNum];
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}

		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다" : "같지 않습니다."));

	}

	// 두 배열이 같은지 검증하는 메서드
	static boolean equals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

}
