package baekjoon;

import java.util.Scanner;

public class B1236 {
	static int N; // 세로
	static int M; // 가로
	static char[][] map; // 2차원 배열
	static int[] n_guard; // 세로 경비원 수
	static int[] m_guard; // 가로 경비원 수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		//세로와 가로에 있는 경비원 수 체크
		char[][] map = new char[N][M];
		n_guard = new int[N];
		m_guard = new int[M];
		
		for(int i = 0; i<M; i++) {
			String dot = sc.next();
			for(int j = 0; j<N; j++) {
				map[j][i] = dot.charAt(j);
				m_guard[i];
				n_guard[j];
				
			}
			
		}
		
		
	}

}
