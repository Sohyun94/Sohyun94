import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dno = 0;
		System.out.println("10진수 변환을 시작합니다.");
		System.out.print("변환할 숫자: ");
		int num = sc.nextInt();
		System.out.println("변환할 진수:" );
		int r = sc.nextInt();
		char[] arr = new char[32];
		dno =ordNum(num, r, arr);
		
		for(int i = 0; i < dno; i++) {
			System.out.print(arr[i]);
		}
	}

	static int ordNum(int num, int r, char[] arr) {
		int digit = 0; // 자릿수
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			arr[digit++] = str.charAt(num % r);
			num /= r;
		} while (num != 0);
		for(int i = 0; i < digit / 2; i++) {
			char tmp = arr[i];
			arr[i] = arr[digit - i - 1];
			arr[digit - i - 1] = tmp;
		}
		return digit;
	}

}
