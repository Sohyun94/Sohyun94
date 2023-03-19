import java.util.Scanner;

public class P2_13_1 {
	static int[][] monthDays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 윤년

	// 윤년 구하는 메서드 (1: 윤년, 0: 평년)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 그 해에서 경과한 일수 구하는 메서드
	static int yearDays(int year, int month, int day) {
		// 일수
		int days = day;
		for (int i = 0; i < month; i++) {
			days += monthDays[isLeap(year)][i];
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그 해로부터 며칠이 경과했는지를 구합니다.");
		int retry; // 다시

		do {
			System.out.print("연: ");
			int year = sc.nextInt();
			System.out.print("월: ");
			int month = sc.nextInt();
			System.out.print("일: ");
			int day = sc.nextInt();

			System.out.println("그 해로부터 " + yearDays(year, month, day) + "일이 흘렀습니다.");
			System.out.println("다시 하겠습니까? 1: 네 0: 아니오");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
