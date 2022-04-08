package class1;

import java.util.Scanner;

public class B1152_단어의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		String[] arr = str.split(" ");
		// 입력된 문자열이 없을 경우 처리 필요
		if (str.isEmpty() == false)
			System.out.print(arr.length);
		else
			System.out.print(0);

	}

}
