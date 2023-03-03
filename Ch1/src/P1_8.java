import java.util.Scanner;

public class P1_8 {
	public static void main(String[] args) {
		// 직각이등변삼각형 출력
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("몇 단 삼각형인가요?");
			n = sc.nextInt();
		} while (n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
