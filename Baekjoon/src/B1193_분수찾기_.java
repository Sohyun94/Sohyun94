import java.util.Scanner;

public class B1193_분수찾기_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		// 대각선 개수
		int cross = 0;

		// 행 번호
		int num = 0;

		while (true) {
			num++;
			cross += num;
			if (cross >= X) {
				if (num % 2 == 0) {
					System.out.println((X - cross + num) + "/" + (cross - X + 1));
				} else
					System.out.println((cross - X + 1) + "/" + (X - cross + num));
				break;
			}
		}

	}

}
