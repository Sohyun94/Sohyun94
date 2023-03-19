import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		System.out.println(yearDays(year, month, day));
	}

	static int[][] monthDays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 윤년

	// 윤년 구하기 메서드 (1: 윤년, 0: 평년)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 경과한 일 수 구하는 메서드
	static int yearDays(int year, int month, int day) {
		int dayNum = day;
		int i = 0;
		while (i < month) {
			dayNum += monthDays[isLeap(year)][i];
			i++;
		}
		return dayNum;
	}
}
