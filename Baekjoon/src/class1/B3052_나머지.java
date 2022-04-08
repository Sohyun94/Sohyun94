package class1;

import java.util.Scanner;

public class B3052_나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		boolean flag = false; // 나머지가 같은지 판별할 변수
		int cnt = 10; // 나머지 개수 셀 변수
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		} // 나머지 담기
		for (int i = 0; i < arr.length; i++) {
			flag = false; // i가 다음으로 넘어갈 때마다 flag 갱신
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					cnt--;
					break; // 숫자가 한 번만 같아도 더 진행할 필요 X
				}
			}
		}//나머지 세어주기 끝
		System.out.println(cnt);
	}

}
