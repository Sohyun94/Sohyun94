package Basic100;

import java.util.Scanner;

public class C1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nums = sc.next();
		// - 기준으로 배열 나누기
		String arr[] = nums.split("\\-");
		System.out.printf("%s%s",arr[0], arr[1]);
	}
}
