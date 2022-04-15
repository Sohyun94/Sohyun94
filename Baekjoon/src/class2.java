import java.util.Scanner;

public class class2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 현재 내 x좌표
		int y = sc.nextInt(); // 현재 내 y 좌표
		int w = sc.nextInt(); // 직사각형 가로 길이
		int h = sc.nextInt(); // 직사각형 세로 길이
		int xMin = Math.min(x, w-x);
		int yMin = Math.min(y, h-y);
		int min = Math.min(xMin, yMin);
		System.out.println(min);

	}

}
