import java.util.Scanner;

public class B1002_터렛 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int x_jo = sc.nextInt();
			int y_jo = sc.nextInt();
			int r_jo = sc.nextInt();
			int x_baek = sc.nextInt();
			int y_baek = sc.nextInt();
			int r_baek = sc.nextInt();

			System.out.println(solution(x_jo, y_jo, r_jo, x_baek, y_baek, r_baek));
		}

	}

	public static int solution(int x_jo, int y_jo, int r_jo, int x_baek, int y_baek, int r_baek) {
		int dist = (int) (Math.pow(x_baek - x_jo, 2) + Math.pow(y_baek - y_jo, 2));

		// 1. 중점과 거리가 같아 값이 무한함
		if (x_jo == x_baek && y_jo == y_baek && r_jo == r_baek)
			return -1;

		// 2. 거리가 더 길어서 접점이 안 생길 때
		else if (dist > Math.pow(r_jo + r_baek, 2))
			return 0;

		// 3. 거리는 더 작으나 만나지 않을 때
		else if (dist < Math.pow(r_baek - r_jo, 2))
			return 0;

		// 4. 해가 하나 생길 때
		else if (dist == Math.pow(r_baek - r_jo, 2))
			return 1;

		else if (dist == Math.pow(r_baek + r_jo, 2))
			return 1;
		return 2;

	}
}
