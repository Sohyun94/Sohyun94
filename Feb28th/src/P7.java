import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("두 자리의 정수를 입력하세요.");
		do {
			System.out.print("입력: ");
			n = sc.nextInt();
		} while (n < 10 ||  n > 99);
		System.out.println("변수 값은 " + n + "입니다.");

	}

}
