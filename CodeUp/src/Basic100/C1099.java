package Basic100;

import java.util.Scanner;

public class C1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] maze = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				maze[i][j] = sc.nextInt();
			}
		} // 미로 입력
//		boolean flag = true; // boolean 판별
		int x = 1;
		int y = 1; // 개미 현재 좌표
//		outer: while (flag) { //while을 꼭 쓸 필요가 없구나..
			for (int i = x; i < maze.length; i++) {
				for (int j = y; j < maze.length; j++) { // 1~9까지 범위 설정(이러면 벗어날 걱정 ㄴㄴ)
					if (maze[x][y] == 0) { // 0이면 오른쪽으로
						maze[x][y] = 9; // 개미 이동 경로에 9 채우기
						y++;
					} else if (maze[x][y] == 1) { // 1이면 왼쪽으로 한 칸 갔다가 아래로
						y--;
						x++;
						break;
					} else if (maze[x][y] == 2) { // 2면 목적지 도착한 거니까 9로 바꾸고 동작 멈추기
						maze[x][y] = 9;
//						flag = false;
						break; // 반복문 탈출
					}
				}
			} // 개미 이동
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

	}
}
