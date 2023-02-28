import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요.: ");
		int a = sc.nextInt();
		int ans = 0;
		while(a > 0) {
			a /= 10;
			ans++;
		}
		System.out.println("그 수는 " + ans +"자리입니다.");

	}

}
