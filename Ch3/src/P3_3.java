import java.util.Random;
import java.util.Scanner;

// 보초법: 찾고 싶은 값을 가장 뒤에 저장해 놓기
public class P3_3 {
	static int seqSearchSen(int[] arr, int num, int key) {
		int i = 0;
		arr[num] = key; // 보초 추가

		while (true) {
			if (arr[i] == key)
				break;
			i++;
		}
		return i == num ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] arr = new int[50];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		int key = sc.nextInt();
		int index = seqSearchSen(arr, arr.length-1, key);
		
		if(index == -1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println(key+"는 " + "arr[" + index + "]에 있습니다.");
		
		
	}

}
