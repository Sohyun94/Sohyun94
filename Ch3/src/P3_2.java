// 선형 검색법

import java.util.Random;
import java.util.Scanner;

public class P3_2 {
	static int seqSearch(int[] arr, int num, int key) {
		for (int i = 0; i < num; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[50];
		Random rd = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
		
		int key = sc.nextInt();
		
		int index = seqSearch(arr, 50, key);
		
		if(index == -1)
			System.out.println("해당 값을 찾을 수 없습니다.");
		else
			System.out.println(key+"은(는) arr[" + index + "]에 있습니다." );
		
	}

}
