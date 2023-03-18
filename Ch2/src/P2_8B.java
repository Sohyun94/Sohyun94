import java.util.Scanner;

public class P2_8B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// num: 숫자, r: 변환할 진수, rdigit: 변환 후 자릿수, retry: 다시 변환할 것인지
		int num, r, rDigit, retry = 0;
		char[] arr = new char[32]; // 변환 후 각 자리 숫자 넣어 두는 문자 배열
		System.out.println("10진수의 기수 변환 시작.");
		do {
			do {
				System.out.print("변환할 정수: ");
				num = sc.nextInt();
			} while (num < 0);

			do {
				System.out.print("변환할 진수(2~36): ");
				r = sc.nextInt();
			} while (r < 2 || r > 36);

			rDigit = ordNum(num, r, arr);
			System.out.print(r + "진수로는 [");
			for (int i = rDigit - 1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
			System.out.print("] 입니다. ");
			System.out.println("변환을 다시 시작할까요?");
			System.out.println("1. 예    0. 아니오");
			retry = sc.nextInt();
		} while (retry == 1);
	}

	// num: 숫자, r: 변환할 진수, arr: 변환해서 나온 배열
	static int ordNum(int num, int r, char[] arr) {
		int digit = 0; // 자릿수
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			arr[digit++] = str.charAt(num % r);
			num /= r;
		} while (num != 0);
		return digit;
	}
}
