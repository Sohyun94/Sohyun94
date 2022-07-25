package july25th;
import java.util.Scanner;

public class B1931_회의실배정2_시간초과 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int time[][] = new int[N][2];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (time[j][1] > time[j + 1][1]) {
					int tmp = time[j][1];
					time[j][1] = time[j+1][1];
					time[j+1][1] = tmp;
				}
				else if(time[j][1] == time[j+1][1]) {
					if(time[j][0] > time[j+1][0]) {
						int tmp = time[j][0];
						time[j][0] = time[j+1][0];
						time[j+1][0] = tmp;
					}
				}
			}
		} // 정렬 끝
//		for(int i = 0 ; i < N; i++) {
//			System.out.print(time[i][0] + " " + time[i][1]);
//			System.out.println();
//		}
		int fin = 0;
		for(int i = 0; i < N; i++) {
				if(time[i][0] >= fin && time[i][1] >= fin) {
					cnt++;
					fin = time[i][1];
				}
			}
		System.out.println(cnt);
		} // main
	}

