import java.util.Scanner;

public class P2_13 {
	static int[][] monthDays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 윤년

	// 윤년 여부 구하는 메서드 (윤년: 1, 평년: 0)
	static int isLeap(int year) {
		// 4로 나누어 떨어지고
		// 100으로 나누어 떨어지지 않거나, 400으로 나누어 떨어지면 윤년
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 해당 연도에서 며칠이 흘렀는지 구하는 메서드
	static int solveDay(int year, int month, int day) {
		int dayNum = day; // 일 수
		for (int i = 1; i < month; i++) {
			dayNum += monthDays[isLeap(year)][i - 1];
		}
		return dayNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("해당 연도에서 며칠이 흘렀는지 구합니다.");
		
		
		do {
			System.out.print("연: ");
			int year = sc.nextInt();
			System.out.print("월: ");
			int month = sc.nextInt();
			System.out.print("일: ");
			int day = sc.nextInt();
			
			System.out.printf("해당 연도에서 %d일이 흘렀습니다.\n", solveDay(year, month, day));
			
			System.out.println("한 번 더 계산할까요?");
			System.out.println("1. 예   2. 아니오");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
