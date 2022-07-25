package july25th;
import java.util.Scanner;

public class B1931_회의실배정 {

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
				if (time[j][0] > time[j + 1][0]) {
					int tmp = time[j][0];
					time[j][0] = time[j+1][0];
					time[j+1][0] = tmp;
				}
				else if(time[j][0] == time[j+1][0]) {
					if(time[j][1] > time[j+1][1]) {
						int tmp = time[j][1];
						time[j][1] = time[j+1][1];
						time[j+1][1] = tmp;
					}
				}
			}
		} // 정렬 끝
		for(int i = 0; i <= time[N-1][1]; i++) {
			// 하다 보니까 이런 식으로 정렬하면 안 된다는 사실을 알게 되었다..
		}
	}

}
