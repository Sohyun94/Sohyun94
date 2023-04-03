import java.util.Scanner;

public class P3_1 {
	static int seqSearch(int[] arr, int num, int key) {
		int i = 0;

		while (true) {
			if (i == num)
				return -1;
			if (arr[i] == key)
				return i;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소의 수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int index = 0;
		index = seqSearch(arr, num, key);

		if (index == -1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println(key + "은(는) " + (index + 1) + "번째에 있습니다.");
	}

}
