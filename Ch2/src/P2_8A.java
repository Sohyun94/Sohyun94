import java.util.Arrays;
import java.util.Scanner;

public class P2_8A {
	// 입력받은 10진수를 다른 진수로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 숫자를 입력하세요.: ");
		int n = sc.nextInt();
		System.out.print("기수를 입력하세요.: ");
		int r = sc.nextInt();
		char[] arr = new char[10000000];
		ordNum(n, r, arr);
		System.out.println(ordNum(n, r, arr));
	}
	
	// n: 변환할 숫자, r: 기수, arr: 변환 배열
	static int ordNum(int n, int r, char[] arr) {
		int digits = 0; // 변환 후 자릿수
		// 2진수부터 36진수
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			// 기수로 나눈 나머지를 배열에 저장
			arr[digits++] = str.charAt(n % r);
			n /= r;
			// 숫자가 0이 되면 빠져나가기
		} while (n != 0);
		return digits;
	}

}
